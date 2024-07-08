import Lesson.Factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    void testFactorialPositiveNumber() {
        assertEquals(6, Factorial.factorial(3));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void testFactorialExceptionForNegativeNumber() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-3);
        });
        assertEquals("Число должно быть целым и положительным.", exception.getMessage());
    }
}