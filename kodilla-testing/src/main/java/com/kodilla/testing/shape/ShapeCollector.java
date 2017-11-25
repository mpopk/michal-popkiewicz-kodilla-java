package com.kodilla.testing.shape;

import java.util.*;



public class ShapeCollector {

    public static ArrayList<Shape> figures = new ArrayList<>();


    public static void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }


    public String getFigure(int n) {
        return figures.get(n).getShapeName();
    }

    public double getField(int n) {
        return figures.get(n).getField();}

    public void showFigures() {

            for (Shape figuresList : figures) {
                System.out.println("Shape: " + figuresList.getShapeName() + " field: " + figuresList.getField());
            }
        }

    }















