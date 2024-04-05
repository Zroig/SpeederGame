import java.util.Random;

public class Main {
    static Random rand = new Random();
    public static void main(String[] args) {
        Speed.Velocitat Velocitat = new Speed.Velocitat();

        SBike Speeder1 = new SBike("El Rayo McQueen");
        SBike Speeder2 = new SBike("Annakin Skywalker");
        SBike Speeder3 = new SBike("Fernando Alonso");

        int distancia = 100;
        Race carrera = new Race(distancia);
        Pista pista1 = new Pista(distancia);
        Pista pista2 = new Pista(distancia);
        Pista pista3 = new Pista(distancia);

        pista1.printPista();
        pista2.printPista();
        pista3.printPista();

        carrera.addSpeeder(Speeder1);
        carrera.addSpeeder(Speeder2);
        carrera.addSpeeder(Speeder3);

        Velocitat.Start();
        carrera.startRace();

        while (carrera.getRacing()) {
            //Calcular velocitat
            Speeder1.setSpeed(Velocitat.tirarBola());
            Speeder2.setSpeed(Velocitat.tirarBola());
            Speeder3.setSpeed(Velocitat.tirarBola());
            //Obstacle
            Speeder1.obstMove(pista1.obstCheck(Speeder1.getPosicio(), Speeder1.getSpeed(), Speeder1.getOldSpeed()));
            Speeder2.obstMove(pista2.obstCheck(Speeder1.getPosicio(), Speeder1.getSpeed(), Speeder1.getOldSpeed()));
            Speeder3.obstMove(pista3.obstCheck(Speeder1.getPosicio(), Speeder1.getSpeed(), Speeder1.getOldSpeed()));
            //Moure
            Speeder1.move();
            Speeder2.move();
            Speeder3.move();
            //Posicions
            //System.out.println(Speeder1.getPosicio()+" "+Speeder2.getPosicio()+" "+Speeder3.getPosicio());
            //Comprovar guanyador
            carrera.checkWinner();
        }
        
    }
    
}
