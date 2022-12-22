public abstract class Diode {
    private DiodeColor color;
    private boolean enabled;

    public Diode(DiodeColor color) {
        this.color = color;
        this.enabled = false;
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable(){
        this.enabled = false;
    }
}