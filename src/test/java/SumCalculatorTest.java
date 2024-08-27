

import com.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumSingleValue() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSumThreeValues() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
