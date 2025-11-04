import java.util.Scanner;

public class ex1{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello, world!");

    System.out.println("Qual o teu nome?");
    String nome = scanner.nextLine();

    System.out.println("Ola " + nome);
}
}
