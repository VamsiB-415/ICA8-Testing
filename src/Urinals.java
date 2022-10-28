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
        System.out.println("Not Yet Implemented");
        return 0;
    }


}
