package creationalPatterns.factoryPattern.animalExample;

public class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}
