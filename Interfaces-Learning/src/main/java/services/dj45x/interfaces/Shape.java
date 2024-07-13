package services.dj45x.interfaces;

public interface Shape {
    void draw();
    double calculateArea();
    double getPerimeter();

    default void describe() {
        System.out.println("This is a shape");
    }
}
