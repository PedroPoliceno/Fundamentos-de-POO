package modelo;

public class Casa extends Financiamento{
    public Casa (double valorDoImovel, int prazoFinanAnos, double taxaAnual){
        super(valorDoImovel, prazoFinanAnos, taxaAnual);
    }

    @Override
    public double totalPagamento(){
        return (calcPagamentoMensal() + 80) * this.getPrazoFinanciamento() * 12;
    }
}
