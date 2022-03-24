package com.company;
import java.util.Scanner;

public class Program {

    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        boolean quit = false;

        printMenu();
        while (!quit){
            System.out.println("Choose the actions: (5 to print menu)");
            char choice = scanner.next().charAt(0);
            scanner.nextLine();

            switch (choice) {
                case '1':
                    calculateCircle();
                    break;

                case '2':
                    calculateSquare();
                    break;

                case '3':
                    calculateRectangle();
                    break;

                case '4':
                    calculateSalary();
                    break;

                case '5':
                    printMenu();
                    break;

                default:
                    System.out.println("Exiting program");
                    quit = true;
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println( "1 - Calculate area and perimeter of a circle \n" +
                            "2 - Calculate area and perimeter of a square\n" +
                            "3 - Calculate area and perimeter of a rectangle\n" +
                            "4 - Run Salary Calculator\n" +
                            "5 - View Menu\n" +
                            "0 - Exit program.\n ");
    }

    private static void calculateCircle() {
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        if (radius > 0){
            Circle circle = new Circle(radius);
            System.out.println("Area of circle = " + String.format("%.2f", circle.getArea()));
            System.out.println("Perimeter of circle = " + String.format("%.2f", circle.getPerimeter()));
        } else {
            System.out.println("Invalid Input.");
        }

    }

    private static void calculateSquare() {
        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        if (side > 0) {
            Square square = new Square(side);
            System.out.println("Area of square = " + square.getArea());
            System.out.println("Perimeter of square = " + square.getPerimeter());
        } else {
            System.out.println("Invalid Input.");
        }
    }

    private static void calculateRectangle() {
        System.out.print("Enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        if ((height > 0) && (width > 0)) {
            Rectangle rectangle = new Rectangle(height, width);
            System.out.println("Area of rectangle = " + rectangle.getArea());
            System.out.println("Perimeter of rectangle = " + rectangle.getPerimeter());
        } else {
            System.out.println("Invalid Input.");
        }
    }

    private static void calculateSalary(){
        System.out.print("Enter hourly salary: \n");
        double hourlySalary = scanner.nextDouble();
        System.out.println("Enter hour of work per day: ");
        double hourPerDay = scanner.nextDouble();
        if ((hourlySalary > 0) && (hourPerDay > 0) && (hourPerDay < 24)) {
            Employee employee = new Employee(hourlySalary, hourPerDay);
            employee.getInfo();
        } else {
            System.out.println("Invalid Input.");
        }
    }
}


