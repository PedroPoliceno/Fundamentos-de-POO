package ex015;

public class Perfume extends Produto{
    String cheiro;
    String fixacao;

    public Perfume(String cheiro, String fixacao, String nome, int cod, double preco) {
        super(cod, nome, preco);
        this.cheiro = cheiro;
        this.fixacao = fixacao;
    }

    public void passarPerfume(int borrifadas){
        System.out.println("Você passou " + borrifadas + " borrifadas.");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("O cheiro é: " + this.cheiro + ", a fixação é "+ this.fixacao);
    }
}
