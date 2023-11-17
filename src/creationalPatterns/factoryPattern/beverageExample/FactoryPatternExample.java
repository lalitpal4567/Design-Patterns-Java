package creationalPatterns.factoryPattern.beverageExample;

interface Beverage {
    void pour();
}

class Tea implements Beverage {
    @Override
    public void pour() {
        System.out.println("Pouring a cup of tea");
    }
}

class Coffee implements Beverage {
    @Override
    public void pour() {
        System.out.println("Pouring a cup of coffee");
    }
}

class Cola implements Beverage {
    @Override
    public void pour() {
        System.out.println("Pouring a glass of cola");
    }
}

class BeverageFactory {
    public Beverage createBeverage(String beverageType) {
        if (beverageType == null) {
            return null;
        }

        if (beverageType.equalsIgnoreCase("TEA")) {
            return new Tea();
        } else if (beverageType.equalsIgnoreCase("COFFEE")) {
            return new Coffee();
        } else if (beverageType.equalsIgnoreCase("COLA")) {
            return new Cola();
        }

        return null;
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        BeverageFactory beverageFactory = new BeverageFactory();

        // Create objects using the factory
        Beverage tea = beverageFactory.createBeverage("TEA");
        Beverage coffee = beverageFactory.createBeverage("COFFEE");
        Beverage cola = beverageFactory.createBeverage("COLA");

        // Call the pour method on each object
        tea.pour();
        coffee.pour();
        cola.pour();
    }
}
