import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void plus() {
        var calculator = new Calculator();
        assertEquals(4,calculator.Plus(2,2));
    }

    @org.junit.jupiter.api.Test
    void minus() {
        var calculator = new Calculator();
        assertEquals(0,calculator.Minus(2,2));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        var calculator = new Calculator();
        assertEquals(4,calculator.Multiply(2,2));

    }

    @org.junit.jupiter.api.Test
    void divide() {
        var calculator = new Calculator();
        assertEquals(1.5,calculator.Divide(3,2));
        assertThrows(ArithmeticException.class, () -> calculator.Divide(5, 0));


    }
}