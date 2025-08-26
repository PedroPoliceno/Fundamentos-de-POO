package util;
import java.util.Scanner;

public class InterfaceUsuario {
    double valorImovelDig;
    int prazoFinanciamentoDig;
    double taxaJurosAnualDig;
    Scanner scanner = new Scanner(System.in);

    boolean valorValido(double teste){
        //Faz o teste para saber se o dado é válido
        if(teste <= 0){
            return false;
        }

        return true;
    }

    void mensagemErro(){
        //Mostra a mensagem de erro na tela
        System.out.println("Valor inválido, digite novamente.");
    }

    public double qValorImovel(){
        while(true){
            System.out.println("Qual é o valor do imóvel?");
            valorImovelDig = scanner.nextDouble();
            if (valorImovelDig > 500 && valorImovelDig < 10000000) { //Faz o teste para saber se o dado é válido
                return this.valorImovelDig;
            }
            mensagemErro();
            }
    }

    public int qPrazoFinanciamento(){
        while(true){
            System.out.println("Qual é o prazo de financiamento? (em anos)");
            this.prazoFinanciamentoDig = scanner.nextInt();
            if (valorValido(prazoFinanciamentoDig) && prazoFinanciamentoDig < 35) {
                return this.prazoFinanciamentoDig;
            }
            mensagemErro();
            }
    }

    public double qTaxaJurosAnual(){
        while (true){
            System.out.println("Qual é a taxa de juros anual?");
            this.taxaJurosAnualDig = scanner.nextDouble();
            if(valorValido(taxaJurosAnualDig) && taxaJurosAnualDig < 100){ //Faz o teste para saber se o dado é válido
                return this.taxaJurosAnualDig;
            }
            mensagemErro();
            }
    }
}
