import java.util.Random;

public class Trip
{
    private RideTypeStrategy rideTypeStrategy;
    private PaymentMethodStrategy paymentMethodStrategy;
    private NotificationServiceStrategy notificationServiceStrategy;
    private double distance;
    private double baseFare = 5.0; // Example base fare

    public void startTrip() {
        double fare = calculateFare();
        System.out.println("Trip started. Estimated fare: $" + fare);
        notificationServiceStrategy.sendNotification("Your trip has started. Estimated fare: $" + fare);
    }

    public void completeTrip()
    {
        double fare = calculateFare();
        paymentMethodStrategy.processPayment(fare);
        notificationServiceStrategy.sendNotification("Your trip is complete. Fare charged: $" + fare);
    }

    public double calculateDistance(String pickupLocation, String dropoffLocation)
    {
        Random random = new Random();
        this.distance = random.nextInt(99) + 1; // Distance will be between 1 and 99 km
        System.out.println("Calculated distance from " + pickupLocation + " to " + dropoffLocation + " is: " + this.distance + " km");
        return this.distance;
    }

    public double calculateFare()
    {
        return rideTypeStrategy.calculateFare(distance, baseFare);
    }

    public void setRideTypeStrategy(RideTypeStrategy rideTypeStrategy)
    {
        this.rideTypeStrategy = rideTypeStrategy;
    }

    public void setPaymentMethodStrategy(PaymentMethodStrategy paymentMethodStrategy)
    {
        this.paymentMethodStrategy = paymentMethodStrategy;
    }

    public void setNotificationServiceStrategy(NotificationServiceStrategy notificationServiceStrategy)
    {
        this.notificationServiceStrategy = notificationServiceStrategy;
    }
}
