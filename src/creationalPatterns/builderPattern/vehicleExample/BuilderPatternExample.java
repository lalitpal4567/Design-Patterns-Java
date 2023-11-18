package creationalPatterns.builderPattern.vehicleExample;

class Vehicle{
    private String brand;
    private String model;
    private int year;
    private String color;
    private int horsePower;

    public Vehicle(String brand, String model, int year, String color, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "brand= " + brand + "\n" +
                "model= " + model + "\n" +
                "year=" + year + "\n" +
                "color= " + color + "\n" +
                "horsePower=" + horsePower;
    }
}

class VehicleBuilder{
    private String brand;
    private String model;
    private int year;
    private String color;
    private int horsePower;

    // required parameters
    VehicleBuilder(String brand){
        this.brand = brand;
    }

    public VehicleBuilder setModel(String model){
        this.model = model;
        return this;
    }
    public VehicleBuilder setColor(String color){
        this.color = color;
        return this;
    }
    public VehicleBuilder setYear(int year){
        this.year = year;
        return this;
    }
    public VehicleBuilder setHorsePower(int horsePower){
        this.horsePower = horsePower;
        return this;
    }
    public Vehicle build(){
        return new Vehicle(brand, model, year, color, horsePower);
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        VehicleBuilder builder = new VehicleBuilder("Toyota");
        Vehicle vehicle = builder.setColor("red")
                .setYear(2005)
                .setHorsePower(2)
                .setModel("Camry")
                .build();

        System.out.println(vehicle);
    }
}
