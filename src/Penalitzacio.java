public class Penalitzacio extends Obstacle {
    // true velocitat=0 false torna casella anterior

    public Penalitzacio(boolean tipus) {
        super(tipus);
    }

    public int effect(int meter) {
        if (tipus) {
            return meter;
        } else {
            return meter-1;
        }
    }

    public boolean isTipus() {
        return tipus;
    }

    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }
}
