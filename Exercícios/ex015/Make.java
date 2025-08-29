package ex015;

public class Make extends Produto{
    String tom;
    String tipo;

    public Make (String tom, String nome, String tipo, int cod, double preco){
        super(cod, nome, preco);
        this.tom = tom;
        this.tipo = tipo;
    }

    public void passarMake(){
        System.out.println("Você passou a maquiagem no " + tipo);
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        super.print();
        System.out.println("O tom é "+ this.tom + ", o tipo é " + this.tipo);
    }
}
