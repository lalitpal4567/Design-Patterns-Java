package creationalPatterns.abstractFactoryPattern.bankExample;

public class SBI implements Bank{
    @Override
    public String getBankName(){
        return "SBI";
    }
}
