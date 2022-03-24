package com.company;


public class Circle implements IShape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return (22 / 7.0) * r * r;
    }
}
