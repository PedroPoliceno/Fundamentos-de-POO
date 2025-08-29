package ex015;

public class Main {
    
    public static void main(String[] args) {
        CarrinhoCompra novoCarrinho = new CarrinhoCompra();
        Make maquiagem = new Make("marrom", "base", "pó", 1, 25.52);
        novoCarrinho.addCarrinho(maquiagem);
        Perfume perfume = new Perfume("Doce", "fraca", "EGEO", 1, 89.99);
        novoCarrinho.addCarrinho(perfume);
        Make maquMake = new Make("branco", "luz", "iluminador", 2, 31.50);
        novoCarrinho.addCarrinho(maquMake);
        novoCarrinho.mostrarCarrinho();

        CarrinhoCompra carrinhoMake = new CarrinhoCompra();
        for(Produto n : novoCarrinho.listaProduto){
            if (n instanceof Make){
                Make novMake = (Make)n;
                carrinhoMake.addCarrinho(novMake);
            }
        }
        System.out.println("\nEsse é o carrinho das maquiagens:");
        carrinhoMake.mostrarCarrinho();
    }
}
