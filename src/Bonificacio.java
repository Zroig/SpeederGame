public class Bonificacio extends Obstacle {
    boolean tipus; // true valor tirada *1.25 false tirada anterior + nova tirada *2

    public Bonificacio(boolean tipus) {
        super(tipus);
    }

    public int effect(int meter) {
        
        return 2;
    }

    public boolean isTipus() {
        return tipus;
    }

    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }
}
