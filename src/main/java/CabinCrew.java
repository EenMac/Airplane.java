public enum CabinCrew {


    ChiefAirHostess("First-Officer"),
    AirHostess( "Flight-attendant");

    private final String rank;

    CabinCrew(String rank) {
        this.rank = rank;
    }

    public String getRankValue() {
        return rank;
    }
}
