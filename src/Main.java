import java.util.Random;

public class Main {
    static Random rand = new Random();
    public static void main(String[] args) {
        SBike Speeder1 = new SBike("El Rayo McQueen");
        SBike Speeder2 = new SBike("Annakin Skywalker");
        SBike Speeder3 = new SBike("Fernando Alonso");
        Race carrera = new Race(50);
        carrera.addSpeeder(Speeder1);
        carrera.addSpeeder(Speeder2);
        carrera.addSpeeder(Speeder3);

        carrera.startRace();

       /*  while (carrera.getRacing()) {
            //Calcular velocitat
            Speeder1.setSpeed(calcVelocitat());
            Speeder2.setSpeed(calcVelocitat());
            Speeder3.setSpeed(calcVelocitat());
            //Moure
            Speeder1.move();
            Speeder2.move();
            Speeder3.move();
            //Comprovar guanyador
            carrera.checkWinner();
        }
        */
        calcVelocitat();
    }

    public static int calcVelocitat() {
        int[][] diana = new int[8][8];
        int velocitat, posX, posY;
        double m = 0.25, fm;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                    diana[i][j] = rand.nextInt(5)-1;
                
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(diana[i][j]+" ");
            }
            System.out.println("");
        }
        posX = rand.nextInt(8);
        posY = rand.nextInt(8);
        fm = diana[posX][posY] + (m * diana[posX][posY]);
        velocitat = (int) (diana[posX][posY] * fm);
        
        return velocitat;
    }
}
