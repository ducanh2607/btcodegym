package automatedtesting;

import com.sun.javafx.runtime.async.AsyncOperationListener;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    public void testFindAbsolute(){
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    public void testFindAbsolute1(){
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    public void testFindAbsolute2(){
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

}