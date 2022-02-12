import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("bot")
public class SkippedTests {

    @Test
    @Disabled
    void test5(){
        assertTrue(true);
    }

    @Test
    @Disabled
    void test6(){
        assertTrue(true);
    }
}
