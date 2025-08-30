package modelo;

public class Apartamento extends Financiamento{
    public Apartamento(double valorDoImovel, int prazoFinanAnos, double taxaAnual){
        super(valorDoImovel, prazoFinanAnos, taxaAnual);
    }

    private double calcTaxaMes(){
        //Calcula a taxa de juros mensal em porcentagem
        return (this.getTaxaJurosAnual() / 100) / 12;
    }
    
    private double mesesFinanciamento(){
        //Calcula o prazo mensal do financiamento
        return this.getPrazoFinanciamento() * 12;
    }

    @Override
    public double calcPagamentoMensal(){
        //Faz o cálculo do pagamento mensal do apartamento
        return getValorImovel() * (this.calcTaxaMes() * Math.pow(1 + this.calcTaxaMes(), this.mesesFinanciamento())) / (Math.pow(1 + this.calcTaxaMes(), this.mesesFinanciamento())-1);
    }
}
