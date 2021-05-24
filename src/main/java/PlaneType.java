public enum PlaneType {
    Boeing747(150, 50),
    AvroRJ85(30, 10 );

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacityValue() {
        return capacity;
    }

    public int getTotalWeightValue() {
        return totalWeight;
    }
}
