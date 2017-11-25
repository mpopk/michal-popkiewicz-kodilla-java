package com.kodilla.testing.shape;

public class Square implements Shape {
    private int field;
    private String shapeName;

    public Square(String shapeName, int field) {
        this.field = field;
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public int getField() {
        return field;
    }
    }

