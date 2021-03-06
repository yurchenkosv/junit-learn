package org.test.app.testproject1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
/**
 *
 * @author yurchenko.s
 */
public class CalculatorTest {
  @Test
  public void evaluateTest() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
  
  @Test
  public void minusTest(){
      Calculator calculator = new Calculator();
      int minus = calculator.minus(5,2);
      assertEquals(3, minus);
  }
  
  @Test
  public void umnojTest(){
      Calculator calculator = new Calculator();
      int umnoj = calculator.umnoj(5, 2);
      assertEquals(10, umnoj);
  }
  
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  
  @Test
  public void divisionTest(){
      thrown.expect(ArithmeticException.class);
      Calculator calculator = new Calculator();
      int div = calculator.division(10, 0);
      assertEquals ( 8, div );
  }
}

