package ex014;

public class Roupa extends Produto{
    String tamanho;

    public Roupa(int id, String nome, double preco, String tamanho){
        super(id, nome, preco);
        this.tamanho = tamanho;
    }

    
    public void print(){
        super.print();
        System.out.println("E o tamanho da roupa é " + this.tamanho);
    }
}
