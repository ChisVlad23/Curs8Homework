package ProductsEx1;

public class Cosmetics extends Product{
    private final String color;
    private final Integer weight;

    public Cosmetics(Integer price, String name, String description, Integer quantity, String color, Integer weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }
}
