package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int field;
    private String shapeName;

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public int getField() {
        return field;
    }

    public Circle(String shapeName, int field) {

        this.shapeName = shapeName;
        this.field = field;
    }
}
