package ex015;

public class Produto {
    protected int idProduto;
    protected String nome;
    protected double preco;

    public Produto(int id, String nome, double preco){
        this.idProduto = id;
        this.nome = nome;
        this.preco = preco;
    }

    public void print(){
        System.out.println("Id: " + this.idProduto + ", nome: " + this.nome + ", preço: " + this.preco);;
    }
}
