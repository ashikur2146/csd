package csd.training.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;
import csd.training.calculator.Calculator;

public class TestCalculator {
	
   @Test
   public void testSimpleAdd() {
      int num1 = 5;
      int num2 = 5;
      Calculator calc = new Calculator(num1, num2);
      int addNumbers = (int) calc.addNumbers();
      assertEquals(10,addNumbers);
   }
   
   @Test
   public void testNegativeAdd() {
      int num1 = -5;
      int num2 = -5;
      Calculator calc = new Calculator(num1, num2);
      int addNumbers = (int) calc.addNumbers();
      assertEquals(-10,addNumbers);
   }
   
   @Test
   public void testFloatingAdd() {
      float num1 = 5.50f;
      float num2 = -5.20f;
      Calculator calc = new Calculator(num1, num2);
      float addNumbers = (float) calc.addNumbers();
      assertEquals(0.30f, addNumbers, 0.01);
   }
   
   @Test
   public void testBigNumberAdd() {
      int num1 = Integer.MAX_VALUE;
      int num2 = 1;
      Calculator calc = new Calculator(num1, num2);
      int addNumbers = (int) calc.addNumbers();
      assertEquals(Integer.MAX_VALUE, addNumbers);
   }
   
   @Test
   public void testSimpleDivision() {
      double num1 = 6;
      double num2 = 2;
      Calculator calc = new Calculator(num1, num2);
      double div = calc.divideNumbers();
      assertEquals(3, div, 0.01);
   }
	
	@Test
	public void testExceptionDivision() {
		int num1 = 6;
	    int num2 = 0;
		Calculator calc = new Calculator(num1, num2);
		assertThrows(ArithmeticException.class, () -> calc.divideNumbers());
	}
}