package services.dj45x.shapes;

import services.dj45x.abstractClasses.AbstractShape;

public class Triangle extends AbstractShape {
    private final double base;
    private final double height;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC, String color) {
        super(color);
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Draws a triangle on the screen.
     */
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return the area of the triangle
     */
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    /**
     * Calculates the perimeter of the triangle.
     *
     * @return the perimeter of the triangle
     */
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * A description of the function that prints out a message about the Triangle and its color.
     */
    @Override
    public void describe() {
        System.out.println("This is a Triangle. The color is: " + getColor());
    }
}
