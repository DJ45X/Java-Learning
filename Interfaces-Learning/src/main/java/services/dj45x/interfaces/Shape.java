package services.dj45x.interfaces;

public interface Shape {
    /**
     * A method to draw the shape.
     */
    void draw();

    /**
     * A method to calculate the area of the shape.
     *
     * @return         the calculated area value
     */
    double calculateArea();

    /**
     * A method to get the perimeter of the shape.
     *
     * @return         the calculated perimeter value
     */
    double getPerimeter();

    /**
     * A description of the entire Java function.
     *
     */
    default void describe() {
        System.out.println("This is a shape");
    }
}
