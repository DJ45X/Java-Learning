package services.dj45x.shapes;

import services.dj45x.abstractClasses.AbstractShape;

public class Rectangle extends AbstractShape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    /**
     * A method to draw the Rectangle.
     */
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    /**
     * A method to calculate the area of the Rectangle.
     *
     * @return         the area of the Rectangle
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * A method to get the perimeter of the Rectangle.
     *
     * @return         the perimeter of the Rectangle
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     * A method to describe the Rectangle shape.
     */
    @Override
    public void describe() {
        System.out.println("This is a Rectangle. The color is: " + getColor());
    }
}
