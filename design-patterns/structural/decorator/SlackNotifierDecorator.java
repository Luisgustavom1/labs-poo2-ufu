public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public void send(String message) {
        // send message in slack
        super.send(message);
        System.out.println("Sended slack -> " + message);
    } 
}