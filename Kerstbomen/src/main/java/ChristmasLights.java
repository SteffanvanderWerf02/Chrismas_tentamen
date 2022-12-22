public abstract class ChristmasLights {
    private Led[][] leds;
    private LightLengthInMeters length;
    private boolean AreLightsOn;
    private LightColor color;
    private double price;
    private String priceLabel;

    public ChristmasLights(LightLengthInMeters length,LightColor color, double price, String priceLabel) {
        this.leds = new Led[length.getNumber()][10];
        this.length = length;
        AreLightsOn = false;
        this.color = color;
        this.price = price;
        this.priceLabel = priceLabel;
    }

    public void turnOn() {
        for (int i = 0; i < this.leds.length; i++) {
            for (int j = 0; j < 10 ; j++) {
                this.leds[i][j].enable(this.color);
            }
        }
    }
}