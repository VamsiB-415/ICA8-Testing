import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
                if(i>0 && i<str.length())
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


}
