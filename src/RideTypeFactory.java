public class RideTypeFactory {
    public static RideTypeStrategy getRideType(String rideType) {
        switch (rideType.toLowerCase()) {
            case "carpool":
                return new CarpoolRide();
            case "luxury":
                return new LuxuryRide();
            case "bike":
                return new BikeRide();
            default:
                throw new IllegalArgumentException("Invalid ride type: " + rideType);
        }
    }
}
