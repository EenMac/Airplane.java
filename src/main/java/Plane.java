public class Plane {

    private PlaneType Boeing747;
    private PlaneType Avro;

    public Plane(PlaneType Boeing747) {
        this.Boeing747 = Boeing747;
    }

    public int getCapacity() {
        return Boeing747.getCapacityValue();
    }

    public int getTotalWeight() {
        return Boeing747.getTotalWeightValue();
    }
    public int bagWeightsAvro(){
        //taking every human and setting to a norm of 25 kgs as a max per person
        int humanCapacity = PlaneType.AvroRJ85.getCapacityValue();
        return humanCapacity * 25;
    }
    public int bagWeightsBoeing(){
        //taking every human and setting to a norm of 25 kgs as a max per person
        int humanCapacity = PlaneType.Boeing747.getCapacityValue();
        return humanCapacity * 25;
    }
    public double maXBagCapacityAvro(){
        int capacity = PlaneType.AvroRJ85.getTotalWeightValue();
        return capacity * 0.5;
    }
    public double maxBagCapacityBoeing(){
        int capacity = PlaneType.Boeing747.getTotalWeightValue();
        return capacity * 0.5;
    }
}
