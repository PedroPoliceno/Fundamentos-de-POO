package Projeto;

public class Financiamento {
    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;
    public Financiamento(double valorDoImovel, int prazoFinanAnos, double taxaAnual){
        this.valorImovel = valorDoImovel;
        this.prazoFinanciamento = prazoFinanAnos;
        this.taxaJurosAnual = taxaAnual;
    }

    double calcPagamentoMensal(){
        return (valorImovel / (prazoFinanciamento * 12)) * (1+ (taxaJurosAnual / 12));
    }

    double totalPagamento(){
        return calcPagamentoMensal() * prazoFinanciamento * 12;
    }
}
