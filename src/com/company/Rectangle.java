package com.company;

public class Rectangle implements IShape {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
    }

    @Override
    public double getPerimeter() {
        return  2 * (height + width);
    }

    @Override
    public double getArea() {
        return height * width;
    }

}
