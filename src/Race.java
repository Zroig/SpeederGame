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
        System.out.println(winner.getSpeeder());
        for (int i = 0; i < sbikes.size(); i++) {
                System.out.println(i+1+" "+sbikes.get(i).getSpeeder());
            }
        }
    }

