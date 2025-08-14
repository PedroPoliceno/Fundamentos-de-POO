package ex010;

public class Main {
        public static void main(String[] args) {
        ContaBancaria novaconta = new ContaBancaria(123, 12, 150.0, "123456");
        novaconta.getmostrarDados();
        System.out.println(novaconta.getAgencia());
        novaconta.setSenha("321");
        novaconta.getmostrarDados();
    }
}
