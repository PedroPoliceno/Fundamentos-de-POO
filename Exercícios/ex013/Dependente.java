package ex013;

public class Dependente {
    String nome;

    public Dependente(String novoNome){
        this.nome = novoNome;
    }

    void showNome(){
        System.out.println(this.nome);
    }
}
