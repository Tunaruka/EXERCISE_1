package com.company;


public final class Circle implements IShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
            return 2 * Math.PI * this.getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
