package creationalPatterns.factoryPattern.animalExample;

public class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
}
