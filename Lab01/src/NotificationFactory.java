public class NotificationFactory
{
    public static NotificationServiceStrategy getNotificationService(String notificationMethod)
    {
        switch (notificationMethod.toLowerCase())
        {
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            case "inapp":
                return new InAppNotification();
            default:
                throw new IllegalArgumentException("Invalid notification method: " + notificationMethod);
        }
    }
}
