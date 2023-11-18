package creationalPatterns.abstractFactoryPattern.bankExample;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        }
        return null;
    }
}
