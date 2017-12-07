package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {
    @Test

    public void testGetAverage(){

        //given

        int[] numbers = new int[20];

        //when

        for(int i = 0; i < 20; i = i + 4);

        double numbersAverage = ArrayOperations.getAverage(numbers);

        //then

        Assert.assertEquals(38, numbersAverage, 0);

    }
}


