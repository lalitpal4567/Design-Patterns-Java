package creationalPatterns.factoryPattern.transportExample;

public class Cycle implements Transport{
    @Override
    public void start() {
        System.out.println("Bicycle started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle braking");
    }
}
