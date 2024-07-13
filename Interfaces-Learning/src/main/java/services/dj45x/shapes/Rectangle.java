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
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void describe() {
        System.out.println("This is a Rectangle. The color is: " + getColor());
    }
}
