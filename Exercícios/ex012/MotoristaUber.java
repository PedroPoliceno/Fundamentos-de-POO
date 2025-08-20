package ex012;

public class MotoristaUber {
    String nome;
    int idMotorista;
    Carro carroAtual;
    public MotoristaUber(String nome, int idMotorista){
        this.nome = nome;
        this.idMotorista = idMotorista;
    }

    Carro addCar(String marca, String modelo, int ano, String placa){
        carroAtual = new Carro(marca, modelo, ano, placa);
        return carroAtual;
    }

    void showDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Id do motorista: " + this.idMotorista);
        carroAtual.showDataCar();
    }

    public static void main(String[] args) {
        MotoristaUber motorista = new MotoristaUber("Pedro", 1);
        motorista.addCar("Chevrolet", "Opala", 1991, "abc111");

        motorista.showDados();
    }
}
