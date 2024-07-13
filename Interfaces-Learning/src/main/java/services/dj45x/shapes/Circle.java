package services.dj45x.shapes;

import services.dj45x.abstractClasses.AbstractShape;

public class Circle extends AbstractShape {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void describe() {
        System.out.println("This is a Circle. The color is: " + getColor());
    }
}
