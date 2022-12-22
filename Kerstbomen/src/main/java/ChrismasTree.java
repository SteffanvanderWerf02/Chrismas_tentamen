import java.util.HashSet;

public abstract class ChrismasTree {
    private int height;
    private TreeType type;
    private double price;
    private String priceLabel;
    private ChristmasLights lights;
    private HashSet<ChristmasBalls> balls;


    public ChrismasTree(int height, TreeType type, double price, String priceLabel, ChristmasLights lights) {
        this.height = height;
        this.type = type;
        this.price = price;
        this.priceLabel = priceLabel;
        this.lights = lights;
        this.balls = new HashSet<>();
    }
}