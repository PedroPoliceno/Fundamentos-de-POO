package main;
import modelo.Apartamento;
import modelo.Casa;
//Importa as classes para o arquivo main
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;
//Importa as utilidades do Java
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Financiamento> novosFinanciamentos = new ArrayList<Financiamento>();
        double totalImoveis = 0;
        double totalFinanciamento = 0;

        InterfaceUsuario usuario = new InterfaceUsuario(); //Cria um objeto da classe Interface
        double valorImovel = usuario.qValorImovel(); //Pede as informações necessárias
        int prazoFinanciamento = usuario.qPrazoFinanciamento();
        double taxaJurosAnual =  usuario.qTaxaJurosAnual();

        //Cria um objetos da classe Casa e adiciona na lista de Financiamentos
        Casa novaCasa = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual);
        novosFinanciamentos.add(novaCasa);
        novaCasa = new Casa(100000, 10, 12);
        novosFinanciamentos.add(novaCasa);
        
        //Cria objetos da classe apartamentos e adiciona na lista de Financiamentos
        Apartamento apartamento = new Apartamento(100000, 10, 12);
        novosFinanciamentos.add(apartamento);
        apartamento = new Apartamento(100000, 10, 12);
        novosFinanciamentos.add(apartamento);
        System.out.println(apartamento.calcPagamentoMensal());

        //Cria objetos da classe terrenos e adiciona na lista de Financiamentos
        Terreno terreno = new Terreno(100000, 10, 12);
        novosFinanciamentos.add(terreno);

        int i = 1;
        //Laço de repetição para mostrar os dados
        for (Financiamento financiamento : novosFinanciamentos){
            financiamento.mostrarDadosFinanciamento(i);

            //Calcula o total dos Imóveis e dos Financiamentos.
            totalFinanciamento = totalFinanciamento + financiamento.totalPagamento();
            totalImoveis = totalImoveis + financiamento.getValorImovel();
            i++;
        }

        //Mostra o resultado dos totais
        System.out.printf("\nO valor total dos imóveis é de " + totalImoveis + ", o valor total dos financiamentos é " + "%.2f", totalFinanciamento);
    }
}
