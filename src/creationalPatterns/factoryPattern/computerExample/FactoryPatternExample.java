package creationalPatterns.factoryPattern.computerExample;

interface ComputerComponent{
    void displayInfo();
}
class Processor implements ComputerComponent{
    @Override
    public void displayInfo(){
        System.out.println("Processor: Intel Core i7");
    }
}

class Memory implements ComputerComponent{
    @Override
    public void displayInfo(){
        System.out.println("Memory: 16GB DDR4");
    }
}

class Storage implements ComputerComponent{
    @Override
    public void displayInfo(){
        System.out.println("Storage: 512GB SSD");
    }
}

class ComputerFactory{
    public ComputerComponent createComponent(String componentName){
        if(componentName == null){
            return null;
        }

        if(componentName.equalsIgnoreCase("processor")){
            return new Processor();
        }else if(componentName.equalsIgnoreCase("storage")){
            return new Storage();
        }else if(componentName.equalsIgnoreCase("memory")){
            return new Memory();
        }

        return null;
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        ComputerComponent storage = factory.createComponent("storage");
        ComputerComponent memory = factory.createComponent("memory");
        ComputerComponent processor = factory.createComponent("processor");
    }
}
