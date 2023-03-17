import java.util.Scanner;
import java.util.Map;

public class Main {
  private static StringUtils stringUtils = new StringUtils();
  private static Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
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
}