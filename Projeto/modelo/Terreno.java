package modelo;

public class Terreno extends Financiamento{
    public Terreno (double valorDoImovel, int prazoFinanAnos, double taxaAnual){
        super(valorDoImovel, prazoFinanAnos, taxaAnual);
    }

    @Override
    public double calcPagamentoMensal(){    
        double pagMen = (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + (getTaxaJurosAnual() / 12));
        return pagMen  + (pagMen * 0.02);
    }
}
