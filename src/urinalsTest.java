import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class urinalsTest {
    Urinals urinals = new Urinals();
    @Test
    public void testgoodString1()
    {
        System.out.println("==========Vamsi Bhargav==Test one executed========");
        assertEquals(true,urinals.goodString("0001001"));

    }
    @Test
    public void testgoodString2()
    {
        System.out.println("==========Vamsi Bhargav==Test 2 executed========");
        assertEquals(false,urinals.goodString("000vamsi001"));
    }
    @Test
    public void testgoodString3()
    {
        System.out.println("==========Vamsi Bhargav==Test 3 executed========");
        assertEquals(true,urinals.goodString("0001001"));
    }
    @Test
    public void testcountUrinals1()
    {
        System.out.println("==========Vamsi Bhargav==Test 4 executed========");
        assertEquals(1,urinals.countUrinals("0001001"));
    }
    @Test
    public void testcountUrinals2()
    {
        System.out.println("==========Vamsi Bhargav==Test 5 executed========");
        assertEquals(-1,urinals.countUrinals("1101001"));
    }
    @Test
    public void testopenFile1()
    {
        System.out.println("==========Vamsi Bhargav==Test 6 executed========");
        assertEquals(true,urinals.openFile("src/urinal.dat"));
    }

    @Test
    public void testwriteToFile1(){
        String opt_File="src/rule.txt";
        assertEquals(true,urinals.writeToFile(opt_File,3));
        System.out.println("==========Vamsi Bhargav==Test 7 executed========");
    }

}


