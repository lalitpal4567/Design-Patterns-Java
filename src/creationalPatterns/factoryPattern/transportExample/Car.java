package creationalPatterns.factoryPattern.transportExample;

public class Car implements Transport{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car braking");
    }
}
