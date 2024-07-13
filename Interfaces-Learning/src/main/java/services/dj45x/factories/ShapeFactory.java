package services.dj45x.factories;

import services.dj45x.interfaces.Shape;
import services.dj45x.shapes.Circle;
import services.dj45x.shapes.Rectangle;
import services.dj45x.shapes.Triangle;

import java.util.Scanner;
public class ShapeFactory {

    /**
     * Creates a Shape based on the given shape type and scanner input.
     *
     * @param  shapeType   the type of shape to create
     * @param  scanner     the scanner object for input
     * @return             the created Shape object
     */
    public static Shape createShape(String shapeType, Scanner scanner) {
        return switch (shapeType.toLowerCase()) {
            case "circle" -> createCircle(scanner);
            case "rectangle" -> createRectangle(scanner);
            case "triangle" -> createTriangle(scanner);
            default -> throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        };
    }

    /**
     * Creates a Circle shape based on the radius and color input.
     *
     * @param  scanner   the scanner object for input
     * @return           the created Circle object
     */
    private static Shape createCircle(Scanner scanner) {
        System.out.println("Enter radius for Circle: ");
        double radius = scanner.nextDouble();

        System.out.println("Enter color for Circle: ");
        String color = scanner.next();

        return new Circle(radius, color);
    }

    /**
     * Creates a Rectangle shape based on the length, width, and color input.
     *
     * @param  scanner   the scanner object for input
     * @return           the created Rectangle object
     */
    private static Shape createRectangle(Scanner scanner) {
        System.out.println("Enter the length for the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width for the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the color for the rectangle: ");
        String color = scanner.next();

        return new Rectangle(length, width, color);
    }

    /**
     * Creates a Triangle shape based on the base, height, sides A, B, C, and color input.
     *
     * @param  scanner   the scanner object for input
     * @return           the created Triangle object
     */
    private static Shape createTriangle(Scanner scanner) {
        System.out.println("Enter base for the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter height for the triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Enter side A for the triangle: ");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B for the triangle: ");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side C for the triangle: ");
        double sideC = scanner.nextDouble();
        System.out.println("Enter color for the triangle: ");
        String color = scanner.next();

        return new Triangle(base, height, sideA, sideB, sideC, color);
    }
}
