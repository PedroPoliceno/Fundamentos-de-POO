package modelo;

import java.text.DecimalFormat;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;
    public Financiamento(double valorDoImovel, int prazoFinanAnos, double taxaAnual){
        this.valorImovel = valorDoImovel;
        this.prazoFinanciamento = prazoFinanAnos;
        this.taxaJurosAnual = taxaAnual;
    }

    /*Getter dos atributos privados */

    public double getValorImovel(){
        return this.valorImovel;
    }

    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }

    double calcPagamentoMensal() {
        //Calcula o pagamento mensal do financiamento
        return (valorImovel / (prazoFinanciamento * 12)) * (1+ (taxaJurosAnual / 12));
    }

    public double totalPagamento(){
        //Calcula o total do pagamento do financiamento
        return calcPagamentoMensal() * prazoFinanciamento * 12;
    }

    //Usa um método para formatar um número com apenas duas casas decimais
    DecimalFormat df = new DecimalFormat("#.00");

    public void mostrarDadosFinanciamento(int ordem){
        //Mostra os dados do financiamento(Valor do imóvel, pagamento mensal, total de pagamento)
        System.out.println("\nFinanciamento "+ ordem +" - Valor do imóvel: " + this.valorImovel);
        System.out.println("Pagamento mensal: " + df.format(calcPagamentoMensal()));
        System.out.println("Total do pagamento: " + df.format(totalPagamento()) + "\n");
    }
}
