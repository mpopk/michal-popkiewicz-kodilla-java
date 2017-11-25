package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.testing.shape.ShapeCollector.*;
import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle1", 20);

        //When
        shapeCollector.addFigure(shape);

        //Then
        assertEquals(shape.getShapeName(), shapeCollector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square("Square1",25);
        shapeCollector.addFigure(shape);

        //When
        shapeCollector.removeFigure(shape);

        //Then
        assertEquals(null, shapeCollector.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle("Triangle", 22);
        //When
        shapeCollector.addFigure(shape);
       shapeCollector.getFigure(0);

        //Then
        assertEquals(shape.getShapeName(), shapeCollector.getFigure(0));
    }

    @Test
    public void testShowFigures() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        ShapeCollector.addFigure(new Circle("Circle2", 30));
        ShapeCollector.addFigure(new Square("Square2", 25));
        ShapeCollector.addFigure(new Triangle("Triangle", 18));

        //When
        shapeCollector.showFigures();

        //Then
        Assert.assertEquals(30, shapeCollector.getField(0),0);


    }
}

