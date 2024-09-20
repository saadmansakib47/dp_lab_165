import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ride type (Carpool, Luxury, Bike): ");
        String rideType = scanner.nextLine();
        RideTypeStrategy rideTypeStrategy = RideTypeFactory.getRideType(rideType);

        System.out.println("Enter payment method (CreditCard, PayPal, DigitalWallet): ");
        String paymentMethod = scanner.nextLine();
        PaymentMethodStrategy paymentMethodStrategy = PaymentMethodFactory.getPaymentMethod(paymentMethod);

        System.out.println("Enter notification method (SMS, Email, InApp): ");
        String notificationMethod = scanner.nextLine();
        NotificationServiceStrategy notificationServiceStrategy = NotificationFactory.getNotificationService(notificationMethod);

        System.out.println("Enter pickup location: ");
        String pickupLocation = scanner.nextLine();
        System.out.println("Enter drop-off location: ");
        String dropoffLocation = scanner.nextLine();

        Trip trip = new Trip();
        trip.setRideTypeStrategy(rideTypeStrategy);
        trip.setPaymentMethodStrategy(paymentMethodStrategy);
        trip.setNotificationServiceStrategy(notificationServiceStrategy);

        double distance = trip.calculateDistance(pickupLocation, dropoffLocation);

        trip.startTrip();
        trip.completeTrip();

        scanner.close();
    }
}
