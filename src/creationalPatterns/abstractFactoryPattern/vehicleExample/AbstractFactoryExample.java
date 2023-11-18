package creationalPatterns.abstractFactoryPattern.vehicleExample;

// AbstractProduct - Engine interface
interface Engine {
    void start();
}

// ConcreteProduct - PetrolEngine
class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

// ConcreteProduct - ElectricEngine
class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

// AbstractProduct - Tire interface
interface Tire {
    void inflate();
}

// ConcreteProduct - SummerTire
class SummerTire implements Tire {
    @Override
    public void inflate() {
        System.out.println("Summer tire inflated");
    }
}

// ConcreteProduct - WinterTire
class WinterTire implements Tire {
    @Override
    public void inflate() {
        System.out.println("Winter tire inflated");
    }
}

// AbstractFactory interface
interface VehicleFactory {
    Engine createEngine();
    Tire createTire();
}

// ConcreteFactory for Petrol Vehicles
class PetrolVehicleFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }

    @Override
    public Tire createTire() {
        return new SummerTire();
    }
}

// ConcreteFactory for Electric Vehicles
class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public Tire createTire() {
        return new WinterTire();
    }
}

// Client code using the Abstract Factory
public class AbstractFactoryExample {
    public static void main(String[] args) {
        // Create a Petrol Vehicle
        VehicleFactory petrolFactory = new PetrolVehicleFactory();
        Engine petrolEngine = petrolFactory.createEngine();
        Tire petrolTire = petrolFactory.createTire();

        // Start the engine and inflate the tire for the Petrol Vehicle
        petrolEngine.start();
        petrolTire.inflate();

        // Create an Electric Vehicle
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        Engine electricEngine = electricFactory.createEngine();
        Tire electricTire = electricFactory.createTire();

        // Start the engine and inflate the tire for the Electric Vehicle
        electricEngine.start();
        electricTire.inflate();
    }
}

