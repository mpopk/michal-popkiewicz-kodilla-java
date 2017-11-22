package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {


    public void testAddFigure() {
        //Given
        Shape shape = new Shape("circle");
        //When
        ShapeCollector.add(shape.getShapeName("circle"));
        String addedFigure = ShapeCollector.getShapeName();
        // then
        addedFigure = ShapeCollector.getShapeName("circle");
        Assert.assertEquals(shape, addedFigure);
    }

    public void testRemoveFigure

    {
        //Given
        Shape shape = new Shape("circle");

        //When
        ShapeCollector.remove(shape.getShapeName("circle"));
        String removedFigure = ShapeCollector.getShapeName;

        //then
        removedFigure = ShapeCollector.getShapeName();
        Assert.assertEquals(shape, removedFigure);
    }

    public void testGetFigure

    {
        //Given
        Shape shape = new Shape("circle");

        //When
        ShapeCollector.add(shape.getShapeName("circle"));

        //Then
        int result = ShapeCollector.getFigure(1);
        Assert.assertEquals(shape, result);
    }
    }
