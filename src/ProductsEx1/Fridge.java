package ProductsEx1;

public class Fridge extends Product{
    private final double temerature;

    public Fridge(Integer price, String name, String description, Integer quantity, double temerature) {
        super(price, name, description, quantity);
        this.temerature = temerature;
    }
}
