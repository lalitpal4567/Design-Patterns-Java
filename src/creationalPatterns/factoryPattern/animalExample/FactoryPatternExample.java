package creationalPatterns.factoryPattern.animalExample;

public class FactoryPatternExample {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal dog = factory.createAnimal("dog");
        Animal cat = factory.createAnimal("lion");
        Animal lion = factory.createAnimal("cat");

        dog.makeSound();
        cat.makeSound();
        lion.makeSound();
    }
}
