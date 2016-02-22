import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Doc on 2/21/16.
 */
public class CalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAdd() throws Exception {
        int result = Calculator.add(1,2);
        int result1 = Calculator.add(50,50);

        assertEquals("Not as expected", 3, result);
        assertEquals("Not as expected", 100, result1);
    }

    @Test
    public void testSubtract() throws Exception {
        int result = Calculator.subtract(1,2);
        int result1 = Calculator.subtract(50,50);

        assertEquals("Not as expected", -1, result);
        assertEquals("Not as expected", 0, result1);
    }

    @Test
    public void testMultiply() throws Exception {
        int result = Calculator.multiply(1,2);
        int result1 = Calculator.multiply(25,4);

        assertEquals("Not as expected", 2, result);
        assertEquals("Not as expected", 100, result1);
    }

    @Test
    public void testDivide() throws Exception {
        double result = Calculator.divide(100,4);
        assertEquals("Not as expected", 25, result, 0.25);

        thrown.expect(DivisionByZeroException.class);
        thrown.expectMessage("Cannot divide by zero!");
        Calculator.divide(100,0);
    }
}