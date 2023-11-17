package creationalPatterns.factoryPattern.transportExample;

public class MotorCycle implements Transport{
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle braking");
    }
}
