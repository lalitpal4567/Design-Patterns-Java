package creationalPatterns.factoryPattern.shapeExample;

public class FactoryPatternExample {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape("rectangle");
        Shape shape2 = factory.createShape("circle");

        shape.draw();
        shape2.draw();
    }
}
