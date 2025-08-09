package ex003;
import java.util.Scanner;
import java.util.Locale;

public class index {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.printf("%s, você tem %d, portanto é menor de idade.", nome, idade);

        } else {
            System.out.printf("%s, você tem %d, portanto é maior de idade.", nome, idade);
        }

        scanner.close();
    }
}