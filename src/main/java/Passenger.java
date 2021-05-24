import java.util.ArrayList;

public class Passenger extends Person{
    private String name;
    private Integer numberOfBags;
    private ArrayList <Passenger> passengers;

    public Passenger(String name, Integer numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return name;
    }

    public int getNumBags() {
        return numberOfBags;
    }

    public int getBagWeight(){
        //25 kgs per bag
        return 25* getNumBags();
    }

}
