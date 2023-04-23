public class Main {
    public static void main(String[] args) {
        Notifier notifier = new NotifierImpl(); 

        NotifierDecorator slackDecorator = new SlackNotifierDecorator(notifier);

        NotifierDecorator facebookDecorator = new FacebookNotifierDecorator(slackDecorator);

        facebookDecorator.send("Message");
    }
}