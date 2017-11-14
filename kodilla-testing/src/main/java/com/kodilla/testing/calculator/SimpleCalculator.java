package com.kodilla.testing.calculator;

public class SimpleCalculator {

   private int a;
   private int b;

   public int addAToB(int a, int b){
       return a + b;
    }

public int substractAFromB(int a, int b){
       return a - b;
    }
public static void main (String[]args){
 SimpleCalculator calculator = new SimpleCalculator();
 int resultA = calculator.addAToB(6,4);
 int resultB = calculator.substractAFromB(6, 4);
System.out.println(resultA);
System.out.println(resultB);
}
}
