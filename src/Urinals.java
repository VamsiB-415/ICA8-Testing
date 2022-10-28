import java.io.*;
import java.util.Scanner;

/**
 * Title: ICA-8 Testing Counting Urinals
 *
 * @author Naga Vamsi Bhargava Reddy Seelam
 */

public class Urinals {
    public static void main(String[] args)
    {
        Urinals urinals = new Urinals();
        Scanner scan=new Scanner(System.in);
        System.out.println("Press 1 for Keyboard input");
        System.out.println("Press 2 for file input");
        int choice=scan.nextInt();
        String s="";
        if(choice==1)
        {
            System.out.println("Enter your input");
            s=scan.next();
            int urinalCount=urinals.countUrinals(s);
            if(urinalCount==-1)
                System.out.println("String is Invalid");
            else
                System.out.println(urinalCount);
        }
        else if(choice == 2)
        {
            boolean temp = urinals.openFile("src/Urinal.dat");
            if(temp==false)
                System.out.println("Failed");
        }
        else
        {
            System.out.println("Enter only 1 or 2");
        }

    }
    Boolean goodString(String str)
    { // checks to see if valid string
       for(int i=0;i<str.length();i++)
       {
           if(i+1<str.length())
           {
               if(str.charAt(i)=='1' && str.charAt(i+1)=='1')
                   return  false;
           }
           if(str.charAt(i)!='0' && str.charAt(i)!='1')
           {
               return false;
           }
       }
        return true;
    }
    int countUrinals(String str)
    {
        if(goodString(str)==false)
        {
            return -1;
        }
        char[] input_str = str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(input_str[i]=='0')
            {
                if(i>0 && i<str.length()-1)
                {
                    if(input_str[i-1]=='0' && input_str[i+1]=='0')
                    {
                        count++;
                        input_str[i]='1';
                    }

                }
                else if(i==0)
                {
                    if(input_str[i+1]=='0')
                    {
                        count++;
                        input_str[i]='1';
                    }
                }
                else
                {
                    if(input_str[i-1]=='0')
                    {
                        count++;
                        input_str[i]='1';
                    }
                }

            }

        }
        return count;
    }

    public Boolean openFile(String filepath) {
        try{
            Urinals urinals=new Urinals();
            //Read from input file
            File file1=new File(filepath);
            if(file1==null)
                throw new IOException();
            File file2=new File("src/counter.txt");
            if(file2==null)
                throw new IOException();
            Scanner c=new Scanner(file2);
            int counter=Integer.parseInt(c.nextLine());
            String file3="src/rule.txt";
            if(counter!=0)
                file3="src/rule"+counter+".txt";
            Scanner scanner=new Scanner(file1);
            while(scanner.hasNextLine()){
                String s=scanner.nextLine();
                if(s.equals("-1"))
                    break;
                int vacancies=urinals.countUrinals(s);
                Boolean v=urinals.writeToFile(file3,vacancies);

            }
            //increment the counter for next output file
            FileWriter filewriter=new FileWriter("src/counter.txt");
            if(filewriter==null)
                throw new IOException();
            filewriter.write(Integer.toString(counter+1));
            filewriter.close();
            System.out.println("Successfully written output to "+file3);
            return true;
        }
        catch(IOException e)
        {
            System.out.println("Error in opening file");
            e.printStackTrace();
            return false;
        }

    }
    public boolean writeToFile(String file,int gaps){
        try {
            FileWriter filewriter = new FileWriter(file, true);
            if(filewriter==null)
                throw new IOException();
            BufferedWriter bufferwriter=new BufferedWriter(filewriter);
            if(bufferwriter==null)
                throw new IOException();
            bufferwriter.write(Integer.toString(gaps));
            bufferwriter.newLine();
            bufferwriter.close();
            return true;
        }
        catch(IOException exception){
            System.out.println("could not find or open the output file");
            exception.printStackTrace();
            return false;
        }
    }
}
