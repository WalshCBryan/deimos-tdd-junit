import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfHashCanBeChanged(){

        assertEquals("", CodeupCrypt.hash);
        CodeupCrypt.hash = "fer";
        assertNotEquals("", CodeupCrypt.hash);
        assertNotNull(CodeupCrypt.hash);
        assertEquals("fer", CodeupCrypt.hash);

    }



}
