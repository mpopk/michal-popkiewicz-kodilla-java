package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

@Test
    public void testAddFigure(){
        //Given
        Shape shape = new Circle("Circle1", 20);
        ArrayList<String> figures = ShapeCollector.getFigures();
        //When
        ShapeCollector shapeCollector = new ShapeCollector();
        figures.add("Circle1");
        //Then
        Assert.assertEquals(shape, figures.get(0));
    }
@Test
    public void testRemoveFigure(){
        //Given
        Shape shape = new Square("Square1", 25);
        ArrayList<String> figures = ShapeCollector.getFigures();
        //When
        figures.remove("Square1");
        //Then
        Assert.assertEquals(shape, null);
    }
@Test
    public void testGetFigure() {
        //Given
        Shape shape = new Triangle("Triangle1", 10);
        ArrayList<String> figures = ShapeCollector.getFigures();
        //When
        figures.get(0);

        //Then
        Assert.assertEquals(shape, figures.get(0));
    }
@Test
    public void testShowFigures() {
        //Given
        Shape shape = new Triangle("Triangle1", 10);
        ArrayList<String> figures = ShapeCollector.getFigures();
        //When

    }
    }

