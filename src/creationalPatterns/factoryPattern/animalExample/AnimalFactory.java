package creationalPatterns.factoryPattern.animalExample;

public class AnimalFactory {
    public Animal createAnimal(String animalType){
        if(animalType == null)
            return null;

        if(animalType.equalsIgnoreCase("cat")){
            return new Cat();
        }else if(animalType.equalsIgnoreCase("lion")){
            return new Lion();
        }else if(animalType.equalsIgnoreCase("dog")){
            return new Dog();
        }

        return null;
    }
}
