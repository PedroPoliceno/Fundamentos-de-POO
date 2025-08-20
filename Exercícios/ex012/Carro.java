package ex012;

public class Carro {
    private String marca;
    private String modelo;
    private int Ano;
    private String placa;

    public Carro (String marca, String modelo, int Ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.Ano = Ano;
        this.placa = placa;
    }

    public void showDataCar(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.Ano);
        System.out.println("Placa: " + this.placa);
    }
}
