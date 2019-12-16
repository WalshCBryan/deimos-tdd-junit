import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Before
    public void setup(){
        CodeupCrypt.hash = "fer";
    }

    @Test
    public void testIfHashCanBeChanged(){
        assertNotEquals("", CodeupCrypt.hash);
        assertNotNull(CodeupCrypt.hash);
        assertEquals("fer", CodeupCrypt.hash);
    }


    @Test
    public void testIfTheEncryptionWorks(){
        assertEquals("f3r", CodeupCrypt.checkPassword());

        CodeupCrypt.hash = "FER";
        assertEquals("F3R", CodeupCrypt.checkPassword());

        CodeupCrypt.hash = "codeup";
        assertEquals("c0d39p", CodeupCrypt.checkPassword());

        CodeupCrypt.hash = "aeiou";
        assertEquals("43109", CodeupCrypt.checkPassword());

        CodeupCrypt.hash = "qwrty";
        assertEquals("qwrty", CodeupCrypt.checkPassword());

        CodeupCrypt.hash = "123$%";
        assertEquals("123$%", CodeupCrypt.checkPassword());

    }

}
