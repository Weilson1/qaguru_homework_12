import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("bot")
public class NegativeTests {

    @Test
    void test1(){
        assertTrue(false);
    }

    @Test
    void test2(){
        assertTrue(false);
    }
}
