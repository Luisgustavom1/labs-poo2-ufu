public class NotifierDecorator implements Notifier {
    private Notifier wrapper;

    public NotifierDecorator(Notifier notifier) {
        this.wrapper = notifier;
    }

    public void send(String message) {
        wrapper.send(message);
    }
}