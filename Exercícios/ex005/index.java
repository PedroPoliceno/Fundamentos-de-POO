package ex005;

public class index {
    public static void main(String[] args) {
        String[] estudantes = {"Maria", "Pedro", "Gabriela"};
        for (String estudante : estudantes){
            System.out.println(estudante);
        }

        for (int i=0; i < estudantes.length ; i++){
            System.out.println(estudantes[i]);
        }
    }
}
