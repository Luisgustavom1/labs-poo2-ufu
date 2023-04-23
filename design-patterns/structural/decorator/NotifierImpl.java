public class NotifierImpl implements Notifier {
    public void send(String message) {
        System.out.println("Sended -> " + message);
    } 
}