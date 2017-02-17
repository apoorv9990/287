import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by patel on 2/16/2017.
 */
public class PalindromTest {
    @Test
    public void checkNumberCase1() {
        boolean result = Palindrome.isPalindrome("11111");
        assertEquals(true, result);
    }

    @Test
    public void checkNumberCase2() {
        boolean result = Palindrome.isPalindrome("9990");
        assertEquals(false, result);
    }

    @Test
    public void checkSimpleString() {
        boolean result = Palindrome.isPalindrome("arora");
        assertEquals(true, result);
    }

    @Test
    public void checkStringCapitalization() {
        boolean result = Palindrome.isPalindrome("Arora");
        assertEquals(true, result);
    }

    @Test
    public void checkWhiteSpaces() {
        boolean result = Palindrome.isPalindrome("Ar ora");
        assertTrue(result);
    }

    @Test
    public void checkPunctuations() {
        boolean result = Palindrome.isPalindrome(";;");
        assertEquals(false, result);
    }

    @Test (expected= NullPointerException.class)
    public void testExceptions() throws Exception {
        String str = null;
        Palindrome.isPalindrome(str);
    }
}
