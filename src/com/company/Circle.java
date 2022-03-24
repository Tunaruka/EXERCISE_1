package com.company;


public class Circle implements IShape {
    private double radius;

    public Circle(double r) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
            return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return (22 / 7.0) * radius * radius;
    }

//    private boolean validateRadius(){
//        if(radius < 0)
//            return false;
//        return true;
//    }
}
