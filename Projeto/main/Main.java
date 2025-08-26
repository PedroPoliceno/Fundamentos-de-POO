package main;
//Importa as classes para o arquivo main
import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> novosFinanciamentos = new ArrayList<Financiamento>();
        double totalImoveis = 0;
        double totalFinanciamento = 0;
        for ( int i = 0; i < 4; i++){
            InterfaceUsuario usuario = new InterfaceUsuario(); //Cria um objeto da classe Interface
            double valorImovel = usuario.qValorImovel(); //Pede as informações necessárias
            totalImoveis += valorImovel; //Calcula o total dos imóveis
            int prazoFinanciamento = usuario.qPrazoFinanciamento();
            double taxaJurosAnual =  usuario.qTaxaJurosAnual();
            //Cria um objeto da classe Financiamento
            Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            totalFinanciamento += novoFinanciamento.totalPagamento();
            //Adiciona o novo financiamento no ArrayList
            novosFinanciamentos.add(novoFinanciamento);
            System.out.println("\nO financiamento foi adicionado!\n");
        }

        int i = 1;
        for (Financiamento financiamento : novosFinanciamentos){
            financiamento.mostrarDadosFinanciamento(i);
            i++;
        }
        System.out.printf("\nO valor total dos imóveis é de " + totalImoveis + ", o valor total dos financiamentos é " + "%.2f", totalFinanciamento);
    }
}
