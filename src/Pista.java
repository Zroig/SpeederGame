import java.util.ArrayList;
import java.util.Random;
public class Pista {
    
    int distancia;
    final double probObstacle = 0.11;
    ArrayList<Integer> obst = new ArrayList<>();
    ArrayList<Boolean> obstType = new ArrayList<>();
    Random probabilitat = new Random();

    public Pista(int distancia) {
        this.distancia = distancia;
        fillObst();
        getObstacleType();
    }

    private void fillObst() {
        boolean isObstacle = false;
        for (int i = 0; i < distancia; i++) {
            isObstacle = probabilitat.nextDouble(0,1) <= probObstacle+0.01;
            if (isObstacle) {
                obst.add(i);
                
            }
        }
    }

    private void getObstacleType() {
        boolean isGood = false;
        for (int i = 0; i < obst.size(); i++) {
            isGood = probabilitat.nextDouble(0,1) > 0.4;
            obstType.add(isGood);
        }
    }

    public void printPista() {
        System.out.print("Obstacles a: ");
        if (obst.size()==0) {
            System.out.print("No n'hi ha");
        } else {
            for (int i = 0; i < obst.size(); i++) {
                System.out.print(obst.get(i)+" ");
            }
        }
        System.out.println("");
        System.out.println("--------------");
    }

}
