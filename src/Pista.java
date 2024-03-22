public class Pista {
    
    int distancia;
    final double probObstacle = 0.11;
    int[] obst;

    public Pista(int distancia) {
        this.distancia = distancia;

    }

    private void fillObst() {
        double aux = distancia*probObstacle;
        int len = (int) aux;
        for (int i = 0; i < len; i++) {
            if (len % i == 0) {
                
            }
        }
    }

}
