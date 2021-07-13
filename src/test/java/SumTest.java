import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void numbers() {
        assertEquals(4, Sum.numbers(2, 2));
    }
}