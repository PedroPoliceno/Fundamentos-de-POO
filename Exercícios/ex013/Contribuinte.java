package ex013;
import java.util.ArrayList;

public class Contribuinte {
    String nome;
    ArrayList<Dependente> dependente = new ArrayList<Dependente>();

    public Contribuinte(String novoNome){
        this.nome = novoNome;
    }

    void ligarDependente(String nomeDependente){
        Dependente novoDependente = new Dependente(nomeDependente);
        dependente.add(novoDependente);
    }

    void imprimir(){
        System.out.println("Nome do contribuinte: " + nome);
    }

    void imprimirDependentes(){
        for(int c = 0; c < dependente.size(); c++){
            System.out.print("Nome do contribuinte: ");
            dependente.get(c).showNome();
        }
    }

    int numeroDependentes(){
        return dependente.size();
    }
}
