public class Bonificacio extends Obstacle {
    // true valor tirada *1.25 false tirada anterior + nova tirada *2

    public Bonificacio(boolean tipus) {
        super(tipus);
    }

    public int effect(int meter, int velocitat, int oldSpeed) {
        if (tipus) {
            return meter+=velocitat*1.25;
        } else {
            return meter+oldSpeed+velocitat;
        }
    }

    public boolean isTipus() {
        return tipus;
    }

    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }
}
