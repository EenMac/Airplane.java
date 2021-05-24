public class AirHostess extends Person{

    private CabinCrew rank;

    public AirHostess(String name, CabinCrew rank) {
        super(name);
        this.rank= rank;
    }

    public CabinCrew getRank() {
        return rank;
    }

    public String getName() {
        return this.name;
    }

//    public CabinCrew getRank() {
//        return this.rank;
//    }
}
