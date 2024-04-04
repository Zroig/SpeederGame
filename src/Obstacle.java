public class Obstacle {
    boolean tipus;
    public Obstacle(boolean tipus) {
        this.tipus = tipus;
    }
    public int effect(int meter, int velocitat, int oldSpeed){
        return meter;
    }
}
