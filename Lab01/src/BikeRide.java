public class BikeRide implements RideTypeStrategy {
    @Override
    public double calculateFare(double distance, double baseFare) {
        return baseFare + (distance * 1.0); // Example Calculation
    }
}
