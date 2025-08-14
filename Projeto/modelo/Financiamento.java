package modelo;

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

    double totalPagamento(){
        //Calcula o total do pagamento do financiamento
        return calcPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento(){
        //Mostra os dados do financiamento(Valor do imóvel, pagamento mensal, total de pagamento)
        System.out.println("Valor do imóvel: " + this.valorImovel);
        System.out.println("Pagamento mensal: " + calcPagamentoMensal());
        System.out.println("Total do pagamento: " + totalPagamento());
    }
}
