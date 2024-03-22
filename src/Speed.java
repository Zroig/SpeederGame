import java.util.Random;

public class Speed {

    static Random rand = new Random();
    final static int dim = 8;
    final static double m = 0.25;
    static int[][] diana;
    static int posX, posY;
    

    public static class Velocitat {
        
        public void Start() {
            diana = new int[dim][dim];
            omplirMatriu();
            printTauler();
        }

        public int tirarBola() {
            return calcVelocitat();
        }

        private static void omplirMatriu() {

            int cont = 0, aux;

            while (cont < 16) {
                posX = rand.nextInt(8);
                posY = rand.nextInt(8);
                if (diana[posX][posY] == 0) {
                    aux = rand.nextInt(5) - 1;
                    while (aux == 0) {
                        aux = rand.nextInt(5) - 1;
                    }
                        diana[posX][posY] = aux;
                    cont++;
                }
            }

        }
        
        private static void printTauler() {
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    System.out.print(diana[i][j]+" ");
                }
                System.out.println("");
            }
        }

        

        public static int calcVelocitat() {
            
            int velocitat;
            double fm;
            
            posX = rand.nextInt(8);
            posY = rand.nextInt(8);
            fm = diana[posX][posY] + (m * diana[posX][posY]);
            velocitat = (int) (diana[posX][posY] * fm);
    
            return velocitat;
        }
        
    }
}
