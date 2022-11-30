package automatedtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void testFizzBuzz15(){
        int number = 15;
        String expected = "FizzBuzz";
        String result = fizzBuzz.checkNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz10(){
        int number = 10;
        String expected = "Buzz";
        String result = fizzBuzz.checkNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz6(){
        int number = 6;
        String expected = "Fizz";
        String result = fizzBuzz.checkNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz17(){
        int number = 17;
        String expected = "17";
        String result = fizzBuzz.checkNumber(number);
        assertEquals(expected, result);
    }

}