package calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author Peter Veres
 */
public class CalculatorTest {
    
    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        int a = 12;
        int b = 30;
        Calculator instance = new Calculator();
        int expResult = 42;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
