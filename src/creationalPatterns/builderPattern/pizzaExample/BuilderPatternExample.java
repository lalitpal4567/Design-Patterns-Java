package creationalPatterns.builderPattern.pizzaExample;

class Pizza{
    private String dough;
    private String sauce;
    private String topping;
    Pizza(String dough, String sauce, String topping){
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }
}

class VegPizzaBuilder{
    private String dough;
    private String sauce;
    private String topping;

    public VegPizzaBuilder addDough(String dough){
        this.dough = dough;
        return this;
    }
    public VegPizzaBuilder addSauce(String sauce){
        this.sauce = sauce;
        return this;
    }
    public VegPizzaBuilder addTopping(String topping){
        this.topping = topping;
        return this;
    }
    public Pizza build(){
        return new Pizza(dough, sauce, topping);
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        VegPizzaBuilder builder = new VegPizzaBuilder();
        Pizza vegPizza = builder.addSauce("red sauce")
                .addDough("flour dough")
                .addTopping("basil")
                .build();

        System.out.println(vegPizza);

    }
}
