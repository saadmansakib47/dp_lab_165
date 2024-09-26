import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Trip trip = new Trip();

        // Input for ride type
        System.out.println("Enter ride type (Carpool, Luxury, Bike): ");
        String rideType = scanner.nextLine();
        if (rideType.equalsIgnoreCase("Carpool"))
        {
            trip.setRideTypeStrategy(new CarpoolRide());
        }
        else if (rideType.equalsIgnoreCase("Luxury"))
        {
            trip.setRideTypeStrategy(new LuxuryRide());
        }
        else if (rideType.equalsIgnoreCase("Bike"))
        {
            trip.setRideTypeStrategy(new BikeRide());
        }
        else
        {
            System.out.println("Invalid ride type.");
            return;
        }

        // Input for payment method
        System.out.println("Enter payment method (CreditCard, PayPal, DigitalWallet): ");
        String paymentMethod = scanner.nextLine();
        if (paymentMethod.equalsIgnoreCase("CreditCard"))
        {
            trip.setPaymentMethodStrategy(new CreditCardPayment());
        }
        else if (paymentMethod.equalsIgnoreCase("PayPal"))
        {
            trip.setPaymentMethodStrategy(new PayPalPayment());
        }
        else if (paymentMethod.equalsIgnoreCase("DigitalWallet"))
        {
            trip.setPaymentMethodStrategy(new DigitalWalletPayment());
        }
        else
        {
            System.out.println("Invalid payment method.");
            return;
        }

        // Input for notification method
        System.out.println("Enter notification method (SMS, Email, InApp): ");
        String notificationMethod = scanner.nextLine();
        if (notificationMethod.equalsIgnoreCase("SMS"))
        {
            trip.setNotificationServiceStrategy(new SMSNotification());
        }
        else if (notificationMethod.equalsIgnoreCase("Email"))
        {
            trip.setNotificationServiceStrategy(new EmailNotification());
        }
        else if (notificationMethod.equalsIgnoreCase("InApp"))
        {
            trip.setNotificationServiceStrategy(new InAppNotification());
        }
        else
        {
            System.out.println("Invalid notification method.");
            return;
        }

        System.out.println("Enter pickup location: ");
        String pickupLocation = scanner.nextLine();
        System.out.println("Enter drop-off location: ");
        String dropoffLocation = scanner.nextLine();


        trip.calculateDistance(pickupLocation, dropoffLocation);
        trip.startTrip();
        trip.completeTrip();

        scanner.close();
    }
}
