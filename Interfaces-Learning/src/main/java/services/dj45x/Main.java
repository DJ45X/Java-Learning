package services.dj45x;

import services.dj45x.factories.ShapeFactory;
import services.dj45x.interfaces.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * A description of the main function that handles shape creation based on user input.
     *
     * @param  args   the array of command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        List<Shape> shapes = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Enter shape type (circle, rectangle, triangle) or 'exit' to finish: ");
                String shapeType = scanner.next();

                if (shapeType.equalsIgnoreCase("exit")) {
                    break;
                }
                Shape shape = ShapeFactory.createShape(shapeType, scanner);
                shapes.add(shape);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.next(); // clears the invalid input
            }
        }

        System.out.println("You have created the following shapes: ");

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            shape.describe();
            System.out.println();
        }

        scanner.close();
    }
}