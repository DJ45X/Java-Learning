package services.dj45x.abstractClasses;

import services.dj45x.interfaces.Colorable;
import services.dj45x.interfaces.Shape;

public abstract class AbstractShape implements Shape, Colorable {
    private final String color;

    public AbstractShape(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void describe() {
        System.out.println("This is a shape with color: " + color);
    }
}
