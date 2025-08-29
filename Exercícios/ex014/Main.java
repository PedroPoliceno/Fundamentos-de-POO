package ex014;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "A Joia", 29.50, "capa dura");
        Roupa roupa = new Roupa(1, "camiseta", 15.50, "G");

        livro.print();
        roupa.print();
    }
}
