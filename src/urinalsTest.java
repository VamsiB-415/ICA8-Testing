import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class urinalsTest {
    Urinals urinals = new Urinals();
    @Test
    public void testgoodString1()
    {
        System.out.println("------------------------Vamsi Bhargav==Test one executed----------------");
        assertEquals(true,urinals.goodString("0001001"));

    }
    @Test
    public void testgoodString2()
    {
        System.out.println("------------------------Vamsi Bhargav==Test one executed----------------");
        assertEquals(false,urinals.goodString("000vamsi001"));
    }
    @Test
    public void testgoodString3()
    {
        System.out.println("------------------------Vamsi Bhargav==Test one executed----------------");
        assertEquals(true,urinals.goodString("0001001"));

    }
}


