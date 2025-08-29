package ex014;

public class Produto {
    int idProduto;
    String nome;
    double preco;

    public Produto(int id, String nome, double preco){
        this.idProduto = id;
        this.nome = nome;
        this.preco = preco;
    }

    public void print(){
        System.out.println("Id: " + this.idProduto + ", nome: " + this.nome + ", preço: " + this.preco);;
    }
}
