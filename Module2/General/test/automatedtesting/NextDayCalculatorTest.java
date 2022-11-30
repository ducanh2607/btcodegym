package automatedtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    NextDayCalculator nextDayCalculator = new NextDayCalculator();
    @Test
    public void testNextDay(){
        int day = 1;
        int month = 1;
        int expected = 2;
        int result = nextDayCalculator.nextDay(day, month);
        assertEquals(expected, result);
    }
    @Test
    public void testNextDay1(){
        int day = 31;
        int month = 1;
        int expected = 1;
        int result = nextDayCalculator.nextDay(day, month);
        assertEquals(expected, result);
    }
    @Test
    public void testNextDay2(){
        int day = 30;
        int month = 4;
        int expected = 1;
        int result = nextDayCalculator.nextDay(day, month);
        assertEquals(expected, result);
    }
    @Test
    public void testNextDay3(){
        int day = 28;
        int month = 2;
        int expected = 1;
        int result = nextDayCalculator.nextDay(day, month);
        assertEquals(expected, result);
    }
    @Test
    public void testNextDay4(){
        int day = 29;
        int month = 2;
        int expected = 1;
        int result = nextDayCalculator.nextDay(day, month);
        assertEquals(expected, result);
    }
    @Test
    public void testNextDay5(){
        int day = 30;
        int month = 12;
        int expected = 31;
        int result = nextDayCalculator.nextDay(day, month);
        assertEquals(expected, result);
    }
}