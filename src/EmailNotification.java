public class EmailNotification implements NotificationServiceStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
