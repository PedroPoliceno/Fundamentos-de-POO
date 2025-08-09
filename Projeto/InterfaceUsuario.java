package Projeto;
import java.util.Scanner;

public class InterfaceUsuario {
    double valorImovelDig;
    int prazoFinanciamentoDig;
    double taxaJurosAnualDig;
    Scanner scanner = new Scanner(System.in);

    public double qValorImovel(){
        System.out.println("Qual é o valor do imóvel?");
        this.valorImovelDig = scanner.nextDouble();
        return this.valorImovelDig;
    }

    public int qPrazoFinanciamento(){
        System.out.println("Qual é o prazo de financiamento? (em anos)");
        this.prazoFinanciamentoDig = scanner.nextInt();
        return this.prazoFinanciamentoDig;
    }

    public double qTaxaJurosAnual(){
        System.out.println("Qual é a taxa de juros anual?");
        this.taxaJurosAnualDig = scanner.nextDouble();
        return this.taxaJurosAnualDig;
    }
}
