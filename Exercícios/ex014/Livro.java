package ex014;

public class Livro extends Produto{
    String tipoCapa;

    public Livro(int id, String nome, double preco, String capa){
        super(id, nome, preco);
        this.tipoCapa = capa;
    }

    public void print(){
        super.print();
        System.out.println("E o tipo de capa é " + this.tipoCapa);
    }
}
