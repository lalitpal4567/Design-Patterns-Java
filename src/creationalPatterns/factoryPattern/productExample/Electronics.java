package creationalPatterns.factoryPattern.productExample;

public class Electronics implements Product{
    private String brand;
    private String model;

    public Electronics(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics - Brand: " + brand + ", Model: " + model);
    }
}
