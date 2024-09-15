public class InAppNotification implements NotificationServiceStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending in-app notification: " + message);
    }
}
