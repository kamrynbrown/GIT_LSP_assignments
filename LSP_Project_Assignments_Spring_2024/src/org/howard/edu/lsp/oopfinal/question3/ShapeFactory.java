package org.howard.edu.lsp.oopfinal.question3;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        throw new IllegalArgumentException("Invalid shape type: " + shapeType);
    }
}
