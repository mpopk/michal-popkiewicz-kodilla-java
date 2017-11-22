package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector implements Shape {
    private Shape shapeName;
    int field;

    private ArrayList<ShapeName> fiugres = new ArrayList<>();
    public void addFigure(Shape shape) {
        this.shapeName = shape;
    }

    public void removeFigure(Shape shape) {
        this.shapeName = shape;

    }

    public void getFigure(int n) {
        return ShapeCollector.get(n);
    }

    public void showFigures() {
        for (String shape : ShapeCollector) {
            System.out.println(shape);
        }

            }

    public String getShapeName() {
        return null;
    }

    public int getField() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        if (field != that.field) return false;
        return shapeName.equals(that.shapeName);
    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + field;
        return result;
    }


    }






