package myPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void FibonacciTest_0 () {
        assertEquals(0, Fibonacci.calculate(0));
    }
    @Test
    public void FibonacciTest_1 () {
        assertEquals(1, Fibonacci.calculate(1));
    }
    @Test
    public void FibonacciTest_2 () {
        assertEquals(1, Fibonacci.calculate(2));
    }
    @Test
    public void FibonacciTest_3 () {
        assertEquals(2, Fibonacci.calculate(3));
    }
    @Test
    public void FibonacciTest_4 () {
        assertEquals(3, Fibonacci.calculate(4));
    }
    @Test
    public void FibonacciTest_5 () {
        assertEquals(5, Fibonacci.calculate(5));
    }
    @Test
    public void FibonacciTest_6 () {
        assertEquals(8, Fibonacci.calculate(6));
    }
    @Test
    public void FibonacciTest_7 () {
        assertEquals(13, Fibonacci.calculate(7));
    }
    @Test
    public void FibonacciTest_8 () {
        assertEquals(21, Fibonacci.calculate(8));
    }
    @Test
    public void FibonacciTest_9 () {
        assertEquals(34, Fibonacci.calculate(9));
    }
    @Test
    public void FibonacciTest_10 () {
        assertEquals(55, Fibonacci.calculate(10));
    }
    @Test
    public void FibonacciTest_minus_1 () {
        assertThrows(NumberFormatException.class, () -> Fibonacci.calculate(-1));
    }
}
