package util;
import java.util.Scanner;

public class InterfaceUsuario {
    double valorImovelDig;
    int prazoFinanciamentoDig;
    double taxaJurosAnualDig;
    Scanner scanner = new Scanner(System.in);

    boolean valorValido(double teste){
        if(teste <= 0){
            return false;
        }

        return true;
    }

    public double qValorImovel(){
        while(true){
            System.out.println("Qual é o valor do imóvel?");
            valorImovelDig = scanner.nextDouble();
        if (valorValido(valorImovelDig)) {
            return this.valorImovelDig;
        }
        System.out.println("Valor inválido, digite novamente.");
        }
    }

    public int qPrazoFinanciamento(){
        while(true){
            System.out.println("Qual é o prazo de financiamento? (em anos)");
            this.prazoFinanciamentoDig = scanner.nextInt();
            if (prazoFinanciamentoDig > 1) {
                return this.prazoFinanciamentoDig;
            }
            System.out.println("Valor inválido, digite novamente");
        }
    }

    public double qTaxaJurosAnual(){
        while (true){
            System.out.println("Qual é a taxa de juros anual?");
            this.taxaJurosAnualDig = scanner.nextDouble();
            if(valorValido(taxaJurosAnualDig) && taxaJurosAnualDig < 100){
                return this.taxaJurosAnualDig;
            }
            System.out.println("Valor inválido, digite novamente!");
        }
    }
}
