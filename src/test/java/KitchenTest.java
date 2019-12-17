import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setup(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("red corn");
    }

    @Test
    public void testIfItsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertEquals(1, kitchenWithOne.size());
    }

    @Test
    public void testIfAddWorks(){
        assertEquals(0, emptyKitchen.size());
        assertEquals(1, kitchenWithOne.size());
        assertEquals(4, kitchenWithMany.size());
    }

    @Test
    public void testIfContainsWorks(){
        assertTrue(kitchenWithMany.contains("yellow corn"));
        assertTrue(kitchenWithMany.contains("white corn"));
        assertTrue(kitchenWithMany.contains("blue corn"));
        assertTrue(kitchenWithMany.contains("red corn"));
        assertFalse(kitchenWithMany.contains("rainbow corn"));
    }

    @Test
    public void testIfPopWorks(){
        kitchenWithOne.pop();
        assertEquals(0, kitchenWithOne.size());
        kitchenWithMany.pop();
        assertFalse(kitchenWithMany.contains("red corn"));
        assertEquals(3, kitchenWithMany.size());
        kitchenWithMany.pop();
        assertFalse(kitchenWithMany.contains("blue corn"));
    }


}