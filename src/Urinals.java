/**
 * Title: ICA-8 Testing Counting Urinals
 *
 * @author Naga Vamsi Bhargava Reddy Seelam
 */

public class Urinals {
    public static void main(String[] args)
    {
        Urinals urinals = new Urinals();
        //System.out.println(urinals.countUrinals("1100001"));
        //goodString("100010101");
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


}
