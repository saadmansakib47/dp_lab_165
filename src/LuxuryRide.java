public class LuxuryRide implements RideTypeStrategy {
    @Override
    public double calculateFare(double distance, double baseFare) {
        return baseFare + (distance * 5.0); // Example calculation
    }
}
