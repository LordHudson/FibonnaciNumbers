import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void isFibonacci() {
        assertFalse(Fibonacci.isFibonacciNumber(-1));
        assertTrue(Fibonacci.isFibonacciNumber(13));
        assertFalse(Fibonacci.isFibonacciNumber(7));
        assertTrue(Fibonacci.isFibonacciNumber(987));
        assertFalse(Fibonacci.isFibonacciNumber(611));
    }

    @Test
    void findFibonacciNumberOFPassedIndex() {
        assertEquals(-1, Fibonacci.findFibonacciNumber(-5));
        assertEquals(5, Fibonacci.findFibonacciNumber(5));
        assertEquals(21, Fibonacci.findFibonacciNumber(8));
        assertEquals(987, Fibonacci.findFibonacciNumber(16));
        assertEquals(832040, Fibonacci.findFibonacciNumber(30));
    }
}