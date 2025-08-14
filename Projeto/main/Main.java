package main;
//Importa as classes para o arquivo main
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario usuario = new InterfaceUsuario(); //Cria um objeto da classe Interface
        double valorImovel = usuario.qValorImovel(); //Pede as informações necessárias
        int prazoFinanciamento = usuario.qPrazoFinanciamento();
        double taxaJurosAnual =  usuario.qTaxaJurosAnual();
        //Cria um objeto da classe Financiamento
        Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        //Usa o método para mostrar os dados do Financiamento
        novoFinanciamento.mostrarDadosFinanciamento();
    }
}
