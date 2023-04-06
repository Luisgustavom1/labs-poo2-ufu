import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual carro vc deseja?\n1 - Porsche\n2 - BMW");

        int carChoose = sc.nextInt();

        if (carChoose == 1) {
            CarFactory porsche = new PorscheFactory();
            ((Car) porsche).build(porsche);
            System.out.println("Você escolheu a porsche");
        }

        if (carChoose == 2) {
            CarFactory bmw = new BMWFactory();
            ((Car) bmw).build(bmw);
            System.out.println("Você escolheu a BMW");
        }
    }
}