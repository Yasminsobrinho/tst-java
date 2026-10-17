import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Bem-vindo(a), " + nome + "!");
        scanner.close();
        System.out.println("Fico feliz em te conhecer!");
    }
}