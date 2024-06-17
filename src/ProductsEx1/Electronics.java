package ProductsEx1;

public class Electronics extends Product{

    private final double length;
    private final double width;
    private final double height;
    private final double weight;

    public Electronics(Integer price, String name, String description, Integer quantity, double length, double width,
                       double height, double weight) {
        super(price, name, description, quantity);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
