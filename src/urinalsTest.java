import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class urinalsTest {
    Urinals urinals = new Urinals();
    @Test
    public void testgoodString()
    {
        System.out.println("------------------------Vamsi Bhargav==Test one executed----------------");
        assertEquals(false,urinals.goodString("VamsiBhargav"));

    }
}


