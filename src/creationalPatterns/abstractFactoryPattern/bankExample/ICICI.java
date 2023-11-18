package creationalPatterns.abstractFactoryPattern.bankExample;

public class ICICI implements Bank{
    @Override
    public String getBankName(){
        return "ICICI";
    }
}
