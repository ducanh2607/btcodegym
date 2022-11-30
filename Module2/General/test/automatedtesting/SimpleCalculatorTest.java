package automatedtesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0and0() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0(){
        int first = 1;
        int second = 0;
        int expected = 1;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1(){
        int first = 0;
        int second = 1;
        int expected = 1;
        int result = SimpleCalculator.add(first, second);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing sub 0-0")
    public void testSub0And0(){
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }@Test
    @DisplayName("Testing sub 1-0")
    public void testSub1And0(){
        int first = 1;
        int second = 0;
        int expected = 1;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }@Test
    @DisplayName("Testing sub 0-1")
    public void testSub0And1(){
        int second = 1;
        int first = 0;
        int expected = -1;
        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}