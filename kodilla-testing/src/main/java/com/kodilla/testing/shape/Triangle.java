package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private int field;

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public int getField() {
        return field;
    }
}
