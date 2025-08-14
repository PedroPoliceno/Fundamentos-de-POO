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
        return (valorImovel / (prazoFinanciamento * 12)) * (1+ (taxaJurosAnual / 12));
    }

    double totalPagamento(){
        return calcPagamentoMensal() * prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento(){
        System.out.println("Valor do imóvel: " + this.valorImovel);
        System.out.println("Pagamento mensal: " + calcPagamentoMensal());
        System.out.println("Total do pagamento: " + totalPagamento());
    }
}
