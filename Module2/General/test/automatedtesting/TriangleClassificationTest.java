package automatedtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassificationTest {
   TriangleClassification triangleClassification = new TriangleClassification();
   @Test
    public void testCheckTriangle1(){
       int side1 = 1;
       int side2 = 2;
       int side3 = 3;
       String expected = "This is triangle";
       String result = triangleClassification.checkTriangle(side1, side2, side3);
      assertEquals(expected, result);
   }
   @Test
   public void testCheckTriangle2(){
      int side1 = 2;
      int side2 = 2;
      int side3 = 3;
      String expected = "This is isosceles triangle";
      String result = triangleClassification.checkTriangle(side1, side2, side3);
      result.equals(expected);
      assertEquals(expected, result);
   }
   @Test
   public void testCheckTriangle3(){
      int side1 = 2;
      int side2 = 2;
      int side3 = 2;
      String expected = "This is equilateral triangle";
      String result = triangleClassification.checkTriangle(side1, side2, side3);
      assertEquals(expected, result);
   }
   @Test
   public void testCheckTriangle4(){
      int side1 = 2;
      int side2 = 3;
      int side3 = 3;
      String expected = "This is isosceles triangle";
      String result = triangleClassification.checkTriangle(side1, side2, side3);
      assertEquals(expected, result);
   }
   @Test
   public void testCheckTriangle5(){
      int side1 = 3;
      int side2 = -1;
      int side3 = 3;
      String expected = "This is not triangle";
      String result = triangleClassification.checkTriangle(side1, side2, side3);
      assertEquals(expected, result);
   }

}