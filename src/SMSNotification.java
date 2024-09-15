public class SMSNotification implements NotificationServiceStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
