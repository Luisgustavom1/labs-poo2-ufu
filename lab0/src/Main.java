import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;

public class Main {
  private static StringUtils stringUtils = new StringUtils();
  private static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    // ex01();
    // ex02();
    // ex03();
    ex04();
  }

  public static void ex01() {
    System.out.println("========= Ex 1 =============");
    System.out.println("Digite a primeira string: ");
    String firstString = sc.nextLine();
    System.out.println("Digite a segunda string: ");
    String secondString = sc.nextLine();

    System.out.println(
        stringUtils.ifStringEndIsEqualToString(firstString, secondString) 
            ? "O final da primeira string contem a segunda string" 
            : "O final da primeira string não contem a segunda string"
    );
  }

  public static void ex02() {
    System.out.println("========= Ex 2 =============");
    System.out.println("Digite uma string: ");

    Map<String, Integer> stringGroup = stringUtils.groupStringByChars(sc.nextLine());

    stringGroup.keySet().forEach((key) -> {
      System.out.println(key + " -> " + stringGroup.get(key));
    });
  }

  public static void ex03() {
    System.out.println("========= Ex 3 =============");
    NumberGuesser.run();
  }

  public static void ex04() {
    Futebolista futebolista = new Futebolista("Luisao c", 80.2, 1.72);
    Corredor corredor = new Corredor("Luisao a", 68.2, 1.82);
    Tenista tenista = new Tenista("Luisao b", 75.2, 1.79);

    Atleta[] atletasVet = new Atleta[3];
    atletasVet[0] = futebolista;
    atletasVet[1] = corredor;
    atletasVet[2] = tenista;

    ArrayList<Comparable> atletasArr = new ArrayList<Comparable>(); 
    atletasArr.add(futebolista);
    atletasArr.add(corredor);
    atletasArr.add(tenista);

    Ordenabled.OrderVet(atletasVet);
    for (int i = 0; i < atletasVet.length; i++) {
      System.out.println(atletasVet[i].getNome());
    }

    System.out.println();
    
    Ordenabled.OrderArr(atletasArr);
    atletasArr.forEach(atleta -> System.out.println(atleta.getNome()));
  }
}