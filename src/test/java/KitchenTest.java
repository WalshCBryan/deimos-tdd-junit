import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    @Test
    public void testIfItsEmpty(){
        Kitchen fersKitchen = new Kitchen();
        assertTrue(fersKitchen.isEmpty());

        Kitchen sophiesKitchen = new Kitchen();
        sophiesKitchen.add("blue corn");
        assertEquals(1, sophiesKitchen.size());

    }

    @Test
    public void testIfAddWorks(){
        Kitchen sophiesKitchen = new Kitchen();

        assertEquals(0, sophiesKitchen.size());

        sophiesKitchen.add("Blue corn");
        assertEquals(1, sophiesKitchen.size());

        sophiesKitchen.add("Yellow corn");
        sophiesKitchen.add("Yellow corn");
        assertEquals(3, sophiesKitchen.size());
    }


    @Test
    public void testIfContainsWorks(){
        Kitchen fersKitchen = new Kitchen();
        fersKitchen.add("white corn");
        fersKitchen.add("white corn");
        fersKitchen.add("yellow corn");
        assertTrue(fersKitchen.contains("yellow corn"));
        assertTrue(fersKitchen.contains("white corn"));
        assertFalse(fersKitchen.contains("blue corn"));
    }


}
