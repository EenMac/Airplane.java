public class ChiefAirHostess extends Person{
    private CabinCrew rank;


    public ChiefAirHostess(String name, CabinCrew rank) {
        super(name);
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public CabinCrew getRank() {
        return this.rank;
    }

    public String speak() {
        return "Please put on your seatbelts";
    }
    public String getRankValue(){
        return this.rank.getRankValue();
    }

}

