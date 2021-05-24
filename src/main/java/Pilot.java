public class Pilot extends Person{

    private String rank;
    private Integer licenseNumber;

    public Pilot(String name, String rank, Integer licenseNumber) {
        super(name);
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public String getRank() {
        return rank;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public String announcement() {
        return "I hope you have a pleasant flight";
    }
}
