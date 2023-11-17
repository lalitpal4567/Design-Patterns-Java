package creationalPatterns.factoryPattern.productExample;

public class ProductFactory {
    public Product createProduct(String productType, String... parameters) {
        if (productType == null) {
            return null;
        }

        switch (productType.toUpperCase()) {
            case "ELECTRONICS":
                if (parameters.length == 2) {
                    return new Electronics(parameters[0], parameters[1]);
                }
                break;
            case "CLOTHING":
                if (parameters.length == 2) {
                    return new Clothing(parameters[0], parameters[1]);
                }
                break;
            case "BOOK":
                if (parameters.length == 2) {
                    return new Book(parameters[0], parameters[1]);
                }
                break;
        }

        return null;
    }
}
