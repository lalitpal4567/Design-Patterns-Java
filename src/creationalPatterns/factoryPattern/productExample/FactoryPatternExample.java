package creationalPatterns.factoryPattern.productExample;

public class FactoryPatternExample {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();

        // Create objects using the factory
        Product electronics = productFactory.createProduct("ELECTRONICS", "Samsung", "Smartphone");
        Product clothing = productFactory.createProduct("CLOTHING", "T-Shirt", "Medium");
        Product book = productFactory.createProduct("BOOK", "Java", "C++ for beginners");

        // Call the displayInfo method on each object
        electronics.displayInfo();
        clothing.displayInfo();
        book.displayInfo();
    }
}
