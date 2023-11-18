package creationalPatterns.abstractFactoryPattern.bankExample;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank("HDFC");
        System.out.println(b.getBankName());
    }
}
