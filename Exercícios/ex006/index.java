package ex006;
import java.util.Scanner;

public class index {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        String ast = "*";
        for (int i = 1; i <= num; i++) {
            System.out.println(ast);
            ast = "*" + ast;
        }
        scanner.close();
    }
}
