public class Penalitzacio extends Obstacle {
    // true velocitat=0 false torna casella anterior

    public Penalitzacio(boolean tipus) {
        super(tipus);
    }

    public int effect(int meter, int velocitat, int oldSpeed) {
        int res;
        if (tipus) {
            res = meter - velocitat;
            if (res >= 0 && res != meter-oldSpeed) {
                return meter-velocitat;
            } else if (res == meter-oldSpeed){
                return meter-oldSpeed-1;
            }else{
                return 0;
            }
        } else {
            res = meter - oldSpeed;
            if (res >= 0) {
                return meter-oldSpeed;
            } else {
                return 0;
            }
        }
    }

    public boolean isTipus() {
        return tipus;
    }

    public void setTipus(boolean tipus) {
        this.tipus = tipus;
    }
}
