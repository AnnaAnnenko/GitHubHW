package qa.annenko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTest {

    @Test
    void exampleTest0() {
        Assertions.assertFalse( 2 < 1);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue( 3 > 1);
    }
}
