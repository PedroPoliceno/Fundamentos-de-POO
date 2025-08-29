package ex015;
import java.util.ArrayList;

public class CarrinhoCompra {
    ArrayList<Produto> listaProduto = new ArrayList<Produto>();
    boolean comprar;

    public boolean addCarrinho(Produto novProduto){
        listaProduto.add(novProduto);
        return true;
    }

    public boolean comprar(boolean comprar){
        if(comprar){
            System.out.println("Os itens foram comprados!");
            return true;
        }
        return false;
    }

    public void mostrarCarrinho(){
        for(Produto produto: listaProduto){
            System.out.println("Nome: " + produto.nome + ", Código:" + produto.idProduto + ", preço " + produto.preco);
        }
    }
}
