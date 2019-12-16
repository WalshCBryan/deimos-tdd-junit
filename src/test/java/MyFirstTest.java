import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    private List<String> names;

    // it runs first
    @Before
    public void initListOfNames(){
        this.names = new ArrayList<>();
        this.names.add("fer");
    }

    @Test
    public void itMakesSureTheEqualsWorks(){
        String expected = "Codeup";
        String actual = "Codeup";
        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());

        assertSame("fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }

}