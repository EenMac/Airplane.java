import java.util.ArrayList;

public class Flight {
    private String flightNo;
    private String destination;
    private String departureLocation;
    private String departureTime;
    private ArrayList<Passenger>passengers;

    public Flight(String flightNo, String destination, String departureLocation, String departureTime, ArrayList<Passenger>passengers) {
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
        this.passengers = passengers;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDepartureTime() {
        return departureTime;}
    public int getPassengerList(){
        return passengers.size();
    }

    public int getRemainingSeats() {
        int capacity = PlaneType.AvroRJ85.getCapacityValue();
        int passengersSeated = passengers.size();
        return capacity - passengersSeated;
    }
}


