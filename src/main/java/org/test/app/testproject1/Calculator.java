/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.app.testproject1;

/**
 *
 * @author yurchenko.s
 */
public class Calculator {
    public int evaluate(String expression) {
    int sum = 0;
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
    public int minus(int a, int b){
        return a-b;
    }
    
    public int umnoj(int a, int b){
        return a*b;
    }
}
