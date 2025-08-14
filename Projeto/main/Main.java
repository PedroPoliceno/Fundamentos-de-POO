package main;
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario usuario = new InterfaceUsuario();
        double valorImovel = usuario.qValorImovel();
        int prazoFinanciamento = usuario.qPrazoFinanciamento();
        double taxaJurosAnual =  usuario.qTaxaJurosAnual();

        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        novoFinanciamento.mostrarDadosFinanciamento();
    }
}
