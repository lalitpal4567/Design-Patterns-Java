package creationalPatterns.builderPattern.computerExample;

// Product: Computer
class Computer {
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;

    public Computer(String processor, int ram, int storage, String graphicsCard) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    // Getters for the Computer properties (processor, ram, storage, graphicsCard)

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}

// Builder Interface
interface ComputerBuilder {
    ComputerBuilder setProcessor(String processor);
    ComputerBuilder setRam(int ram);
    ComputerBuilder setStorage(int storage);
    ComputerBuilder setGraphicsCard(String graphicsCard);
    Computer build();
}

// Concrete Builder
class ConcreteComputerBuilder implements ComputerBuilder {
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;

    @Override
    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        System.out.println(this);
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        System.out.println(this);
        return this;
    }

    @Override
    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public String toString() {
        return "ConcreteComputerBuilder{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    @Override
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(processor, ram, storage, graphicsCard);
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        // Using the builder to construct a Computer object
        ComputerBuilder builder = new ConcreteComputerBuilder();
        Computer computer = builder
                .setProcessor("AMD Ryzen 9")
                .setRam(32)
                .setStorage(1000)
                .setGraphicsCard("AMD Radeon RX 6800 XT")
                .build();

        // Displaying the constructed Computer object
        System.out.println("Computer: " + computer);
    }
}
