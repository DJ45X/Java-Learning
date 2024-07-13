package services.dj45x.shapes;

import services.dj45x.abstractClasses.AbstractShape;

public class Circle extends AbstractShape {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    /**
     * A method to draw the circle.
     */

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    /**
     * A method to calculate the area of the circle.
     *
     * @return         the calculated area of the circle
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * A method to get the perimeter of the circle.
     *
     * @return         the calculated perimeter of the circle
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * A method to describe the Circle shape.
     */
    @Override
    public void describe() {
        System.out.println("This is a Circle. The color is: " + getColor());
    }
}
