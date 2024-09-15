public class Trip {
    private RideTypeStrategy rideTypeStrategy;
    private PaymentMethodStrategy paymentMethodStrategy;
    private NotificationServiceStrategy notificationServiceStrategy;
    private double distance;
    private double baseFare;

    public Trip(RideTypeStrategy rideTypeStrategy, PaymentMethodStrategy paymentMethodStrategy, NotificationServiceStrategy notificationServiceStrategy, double distance, double baseFare) {
        this.rideTypeStrategy = rideTypeStrategy;
        this.paymentMethodStrategy = paymentMethodStrategy;
        this.notificationServiceStrategy = notificationServiceStrategy;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    public void startTrip() {
        double fare = rideTypeStrategy.calculateFare(distance, baseFare);
        System.out.println("Trip started. Estimated fare: $" + fare);
        notificationServiceStrategy.sendNotification("Your trip has started. Estimated fare: $" + fare);
    }

    public void completeTrip() {
        double fare = rideTypeStrategy.calculateFare(distance, baseFare);
        paymentMethodStrategy.processPayment(fare);
        notificationServiceStrategy.sendNotification("Your trip is complete. Fare charged: $" + fare);
    }
}
