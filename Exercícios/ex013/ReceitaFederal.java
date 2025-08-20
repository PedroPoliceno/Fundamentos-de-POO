package ex013;

public class ReceitaFederal {
    public static void main(String[] args) {
        Contribuinte nContribuinte = new Contribuinte("Pedro");
        nContribuinte.ligarDependente("Ismael");
        nContribuinte.imprimirDependentes();
        nContribuinte.imprimir();
        nContribuinte.ligarDependente("Francielle");
        nContribuinte.imprimirDependentes();
        System.out.println("O número de dependente é de: " + nContribuinte.numeroDependentes());
    }
}
