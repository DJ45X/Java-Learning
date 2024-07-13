# Overview
This Java application leverages various advanced concepts to create, manage, and manipulate different geometric shapes. The application showcases the use of interfaces, abstract classes, design patters, exception handling, collections and polymorphism.

## Key Concepts
### 1. Interfaces
- Interfaces in Java are abstract types that allow the declaration of methods that must be implemented by any class that implements the interface. This promotes a contract-based design.
- In this application, the `Shape` interface defines the methods `draw()`, `calculateArea()`, `getPerimeter()`, and a default method `describe()`.
   ```java
    public interface Shape {
        void draw();
        double calculateArea();
        double getPerimeter();
        default void describe() {
            System.out.println("This is a shape");
        }    
   }
   ```
  
### 2. Abstract Classes
- Abstract classes in Java provide a base class that cannot be instantiated directly. They can contain both abstract methods (without implementation) and concrete methods (with implementation).
- The `AbstractShape` class implements the `Shape` and `Colorable` interfaces, providing common functionality and properties for all shapes.
    ```java
  public abstract class AbstractShape implements Shape, Colorable {
        protected String color;

        public AbstractShape(String color) {
            this.color = color;
        }

        @Override
        public void describe() {
            System.out.println("This is a " + this.getClass().getSimpleName() + " with color: " + color);
        }
  }
    ```
  
### 3. Extending Abstract Classes
- Concrete classes like `Circle`, `Rectangle`, and `Triangle` extend `AbstractShape`, inheriting its properties and methods while providing specific implementations for the abstract methods declared in the `Shape` interface.

    ```java
    public class Circle extends AbstractShape {
        private double radius;
    
        public Circle(double radius, String color) {
            super(color);
            this.radius = radius;
        }
    
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    ```
  
### 4. Factory Pattern
- The factory patter is a creational design pattern that provides a way to create objects without specifying the exact class of object that will be created.
- The `ShapeFactory` class encapsulates the logic for creating different shapes based on user input.
    ```java
    public class ShapeFactory {
        public static Shape createShape(String shapeType, Scanner scanner) {
            switch (shapeType.toLowerCase()) {
                case "circle":
                    return createCircle(scanner);
                case "rectangle":
                    return createRectangle(scanner);
                case "triangle":
                    return createTriangle(scanner);
                default:
                    throw new IllegalArgumentException("Unknown shape type: " + shapeType);
            }
        }

        private static Circle createCircle(Scanner scanner) {
            System.out.println("Enter radius for Circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Enter color for Circle: ");
            String color = scanner.next();
            return new Circle(radius, color);
        }

        private static Rectangle createRectangle(Scanner scanner) {
            System.out.println("Enter length for Rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Enter width for Rectangle: ");
            double width = scanner.nextDouble();
            System.out.println("Enter color for Rectangle: ");
            String color = scanner.next();
            return new Rectangle(length, width, color);
        }

        private static Triangle createTriangle(Scanner scanner) {
            System.out.println("Enter base for Triangle: ");
            double base = scanner.nextDouble();
            System.out.println("Enter height for Triangle: ");
            double height = scanner.nextDouble();
            System.out.println("Enter side A for Triangle: ");
            double sideA = scanner.nextDouble();
            System.out.println("Enter side B for Triangle: ");
            double sideB = scanner.nextDouble();
            System.out.println("Enter side C for Triangle: ");
            double sideC = scanner.nextDouble();
            System.out.println("Enter color for Triangle: ");
            String color = scanner.next();
            return new Triangle(base, height, sideA, sideB, sideC, color);
        }
    }

    ```
  
### 5. Exception Handling
- Exception handling in Java allows the program to handle runtime errors and continue its execution.
- The `Main` class includes exception handling to manage invalid user inputs gracefully.

    ```java
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
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
                    scanner.next(); // Clear the invalid input
                }
            }
    
            System.out.println("You have created the following shapes:");
    
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
    ```
  
### 6. Collections
- Collections in Java are used to store and manipulate groups of objects.
- This application uses a `List` to store created shapes and iterates over the list to display their details

    ```java
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0, "Red"));
        shapes.add(new Rectangle(4.0, 3.0, "Blue"));
        shapes.add(new Triangle(4.0, 3.0, 3.0, 4.0, 5.0, "Green"));
    
    ```
  
### 7. Polymorphism
- Polymorphism allows objects to be treated as instances of their parent class rather than their actual class.
- This application demonstrates polymorphism by processing different shapes using their common interface methods

    ```java
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            shape.describe();
        }
    ```
  
## Summary
This Shape Drawing application demonstrates a variety of advanced Java concepts including interfaces, abstract classes, the factory pattern, exception handling, collections, and polymorphism. These concepts are applied to create a flexible and extensible application for managing geometric shapes, providing a solid foundation for further enhancements and learning.