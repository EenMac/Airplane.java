import java.util.ArrayList;

public class FlightManager {
    private Flight flight;
    private PlaneType planeType;
    private Plane plane;
    private Flight passengers;
    private Passenger passenger;
    private int bagWeight;


    public FlightManager(Flight flight, PlaneType planeType, Plane plane,Flight passengers, Passenger passenger) {
        this.flight = flight;
        this.planeType = planeType;
        this.plane = plane;
        this.passengers = flight.getPassengerList();
        this.passenger = passenger;
        this.bagWeight = plane.bagWeightsAvro();
    }


    public int totalPassengers() {
        return this.passengers.size();
    }
}
