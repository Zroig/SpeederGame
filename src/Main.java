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
        Pista pista = new Pista(distancia);

        pista.printPista();

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
            //Moure
            Speeder1.move();
            Speeder2.move();
            Speeder3.move();
            //Comprovar guanyador
            carrera.checkWinner();
        }
        
    }
    
}
