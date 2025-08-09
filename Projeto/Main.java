package Projeto;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario usuario = new InterfaceUsuario();
        double valorImovel = usuario.qValorImovel();
        int prazoFinanciamento = usuario.qPrazoFinanciamento();
        double taxaJurosAnual =  usuario.qTaxaJurosAnual();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        System.out.println("O valor mensal a ser pago é: " + novoFinanciamento.calcPagamentoMensal());
        System.out.println("O valor total de pagamento é: " + novoFinanciamento.totalPagamento());
    }
}
