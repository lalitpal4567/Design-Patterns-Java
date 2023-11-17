package creationalPatterns.factoryPattern.transportExample;

public class FactoryPatternExample {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        // Create objects using the factory
        Transport car = transportFactory.createTransport("CAR");
        Transport bicycle = transportFactory.createTransport("BICYCLE");
        Transport motorcycle = transportFactory.createTransport("MOTORCYCLE");

        // Call methods on each object
        car.start();
        car.accelerate();
        car.brake();

        System.out.println();   // new line

        bicycle.start();
        bicycle.accelerate();
        bicycle.brake();

        System.out.println();   // new line

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
    }
}
