package com.kodilla;

public class Calculator {
private int x
private int y


public int addXAndY(int x, int y){
    return x + y;}

    public int susbtractYFromX(int x, int y){
    return x - y;}

    public static void main (String[]args){

        Calculator calculator = new Calculator(){
        int result = calculator.addXAndY();
        int result2 = calculator.susbtractYFromX();
    System.out.println(result);

        System.out.println(result2);

    }


}