public class Penalitzacio extends Obstacle {
    // true velocitat=0 false torna casella anterior

    public Penalitzacio(boolean tipus) {
        super(tipus);
    }

    public int effect(int meter, int velocitat, int oldSpeed) {
        if (tipus) {
            return meter-velocitat;
        } else {
            return meter-oldSpeed;
        }
    }

    public boolean isTipus() {
        return tipus;
    }

    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }
}
