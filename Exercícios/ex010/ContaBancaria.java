package ex010;

public class ContaBancaria {
    private int numeroConta;
    private int agencia;
    private double saldo;
    private String senha;

    ContaBancaria(int conta, int ag, double saldo, String sen){
        this.numeroConta = conta;
        this.agencia = ag;
        this.saldo = saldo;
        this.senha = sen;
    }

    public void getmostrarDados(){
        System.out.println("Conta: " + numeroConta);
        System.out.println("Agência:" + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Senha:" + senha);
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setSenha(String novaSenha){
        this.senha = novaSenha;
    }    
}
