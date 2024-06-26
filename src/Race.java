import java.util.ArrayList;

public class Race {
    ArrayList<SBike> sbikes = new ArrayList<>();
    int distancia;
    SBike winner = new SBike("");
    boolean racing = false;

    public Race(int distancia) {

        this.distancia = distancia;

    }

    public boolean getRacing() {
        return racing;
    }

    public void addSpeeder(SBike speeder) {
        sbikes.add(speeder);
    }

    public void checkWinner() {
        for (int i = 0; i < sbikes.size(); i++) {
            if(sbikes.get(i).getPosicio() >= distancia) {
                winner = sbikes.get(i);
                sbikes.remove(i);
                this.racing = false;
                displayResults();
                break;
            }
        }
        
    }

    public void startRace() {
        this.racing = true;
    }

    public void displayResults() {
        System.out.println("+-------------------------------------+\n|            R A N K I N G            |\n+-------------------------------------+");
        System.out.println("    1. "+winner.getSpeeder());
        for (int i = 0; i < sbikes.size(); i++) {
                System.out.println("    "+(i+2)+". "+sbikes.get(i).getSpeeder());
            }
        }
    }

