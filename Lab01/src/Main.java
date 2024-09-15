import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // User input ride type
        System.out.println("Enter ride type (Carpool, Luxury, Bike): ");
        String rideType = scanner.nextLine();
        RideTypeStrategy rideTypeStrategy = RideTypeFactory.getRideType(rideType);

        // User input payment method
        System.out.println("Enter payment method (CreditCard, PayPal, DigitalWallet): ");
        String paymentMethod = scanner.nextLine();
        PaymentMethodStrategy paymentMethodStrategy = PaymentMethodFactory.getPaymentMethod(paymentMethod);

        // User input notification preference
        System.out.println("Enter notification method (SMS, Email, InApp): ");
        String notificationMethod = scanner.nextLine();
        NotificationServiceStrategy notificationServiceStrategy = NotificationFactory.getNotificationService(notificationMethod);

        // Setting trip details
        double distance = 1.0;
        double baseFare = 40.0;

        // Creating and starting the trip
        Trip trip = new Trip(rideTypeStrategy, paymentMethodStrategy, notificationServiceStrategy, distance, baseFare);
        trip.startTrip();
        trip.completeTrip();

        scanner.close();
    }
}
