import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class Pista {
    
    int distancia;
    final double probObstacle = 0.11;
    ArrayList<Integer> obst = new ArrayList<>();
    HashMap<Integer, Obstacle> obstWithType = new HashMap<>();
    Random probabilitat = new Random();

    public Pista(int distancia) {
        this.distancia = distancia;
        fillObst();
        setObstacle(distancia);
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

    private boolean setObstacleType() {
        boolean isGood = false;
        isGood = probabilitat.nextDouble(0,1) > 0.4;
        return isGood;
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

    public void setObstacle(int distancia) {
        boolean exists = false;
        boolean bonus = false;
        boolean type = false;
        for (int i = 0; i < obst.size(); i++) {
            for (int j = 0; j<distancia; j++) {
                exists = j==obst.get(i) && !(obstWithType.containsKey(j)) ? true : false;
                if (exists) {
                    bonus = setObstacleType();
                    if (bonus) {
                        type = probabilitat.nextDouble(0,1) >= 0.5;
                        Obstacle obst = new Bonificacio(type);
                        obstWithType.put(i, obst);
                    } else {
                        type = probabilitat.nextDouble(0,1) >= 0.5;
                        Obstacle obst = new Penalitzacio(type);
                        obstWithType.put(i, obst);
                    }
                    break;
                }  
            }
            
        }

    }

}
