import java.util.ArrayList;

public class CabinCrewMembers{
    private ArrayList<AirHostess>airHostess;
    private ArrayList<ChiefAirHostess>chiefAirHostess;
    private ArrayList<Passenger>jumpSeat;

    public CabinCrewMembers(ArrayList<AirHostess>airHostess, ArrayList<ChiefAirHostess>chiefAirHostess, ArrayList<Passenger>jumpSeat) {
        this.airHostess = airHostess;
        this.chiefAirHostess = chiefAirHostess;
        //adds a passenger to jump seat which is the emergency seat in the cockpit
        this.jumpSeat = jumpSeat;
    }

    public ArrayList<AirHostess> getAirHostess() {
        return airHostess;
    }

    public ArrayList<ChiefAirHostess> getChiefAirHostess() {
        return chiefAirHostess;
    }


    public int getAirHostessNumbers() {
        return airHostess.size();
    }

    public int getChiefAirHostessNumbers() {
        return chiefAirHostess.size();
    }
    public int getJumpSeat(){
        return jumpSeat.size();
    }
}
