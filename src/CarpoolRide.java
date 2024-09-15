public class CarpoolRide implements RideTypeStrategy {
    @Override
    public double calculateFare(double distance, double baseFare) {
        return baseFare + (distance * 2.0); // Example Calculation
    }
}
