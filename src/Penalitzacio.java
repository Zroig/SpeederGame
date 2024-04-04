public class Penalitzacio extends Obstacle {
    boolean tipus; // true velocitat=0 false torna casella anterior

    public boolean isTipus() {
        return tipus;
    }

    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }
}
