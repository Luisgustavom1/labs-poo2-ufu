public class FacebookNotifierDecorator extends NotifierDecorator {
    public FacebookNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        // send direct in Facebook
        super.send(message);
        System.out.println("Sended facebook -> " + message);
    } 
}