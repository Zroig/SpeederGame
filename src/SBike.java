public class SBike {
    public String speeder;
    int velocitat;
    public int posicio = 0;

    public SBike(String speeder) {

        this.speeder = speeder;

    }

    public void move() {
        this.posicio += velocitat;
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
        this.velocitat = velocitat;

    }

}
