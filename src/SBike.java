public class SBike {
    public String speeder;
    int velocitat = 0, oldSpeed;
    public int posicio = 0;

    public SBike(String speeder) {

        this.speeder = speeder;

    }

    public void move() {
        this.posicio += velocitat;
    }

    public void obstMove(int newPos) {
        this.posicio = newPos;
        
    }

    public int getPosicio() {
        return posicio;
    }

    public String getSpeeder() {
        return speeder;
    }

    public void setSpeeder(String speeder) {
        this.speeder = speeder;
    }

    public void setSpeed(int velocitat) {
        setOldSpeed();
        this.velocitat = velocitat;

    }

    public int getSpeed(){
        return velocitat;
    }

    public void setOldSpeed() {
        oldSpeed = velocitat;
    }

    public int getOldSpeed() {
        return oldSpeed;
    }

}
