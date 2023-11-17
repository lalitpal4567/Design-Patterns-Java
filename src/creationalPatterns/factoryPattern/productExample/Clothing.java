package creationalPatterns.factoryPattern.productExample;

public class Clothing implements Product{
    private String type;
    private String size;

    public Clothing(String type, String size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing - Type: " + type + ", Size: " + size);
    }
}
