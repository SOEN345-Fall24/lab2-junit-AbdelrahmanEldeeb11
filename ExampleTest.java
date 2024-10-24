import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void testFunction_A_PositiveInput() {
        Example example = new Example(2, 3);
        int result = example.Function_A(5);
        assertEquals(7, result);  // 5 + 2
    }

    @Test
    public void testFunction_A_NegativeInput() {
        Example example = new Example(4, 3);
        int result = example.Function_A(-1);
        assertEquals(-5, result);  // -1 - 4
    }

    @Test
    public void testFunction_B_LessThan6() {
        Example example = new Example(2, 3);
        int result = example.Function_B(4);
        assertEquals(7, result);  // 4 + 3
    }

    @Test
    public void testFunction_B_GreaterThanOrEqual6() {
        Example example = new Example(2, 3);
        int result = example.Function_B(6);
        assertEquals(3, result);  // 6 - 3
    }
}

