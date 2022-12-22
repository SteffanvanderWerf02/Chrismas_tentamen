public class Led {
    private Diode[] diodes;

    public Led() {
        this.diodes = new Diode[2];

        this.diodes[0] = new RedDiode();
        this.diodes[1] = new GreenDiode();
        this.diodes[2] = new BlueDiode();
    }

    public void enable(LightColor color) {
        switch (color) {
            case RED:
                this.diodes[0].enable();
                break;
            case WHITE:
                for (int i = 0; i < this.diodes.length; i++) {
                    this.diodes[i].enable();
                }
                break;
            case PURPLE:
                this.diodes[0].enable();
                this.diodes[2].enable();
                break;
        }
    }
}