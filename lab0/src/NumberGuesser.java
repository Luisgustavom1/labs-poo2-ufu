import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); 
        int randomNumber = rand.nextInt(101);

        System.out.println("Vamos começar, chute um núemro");
        int myGuess = sc.nextInt();

        while (myGuess != randomNumber) {            
            if (myGuess < randomNumber) {
                System.out.println("Seu chute foi muito baixo");
            } else {
                System.out.println("Seu chute foi muito alto");
            }

            System.out.println("Tente novamente:");
            myGuess = sc.nextInt();
        }

        System.out.println("Parabéns você acertou o número!!");
    }
}