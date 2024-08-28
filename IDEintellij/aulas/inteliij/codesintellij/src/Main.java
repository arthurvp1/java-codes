import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double cortisol;
        boolean resultadoExame;
        System.out.printf("Digite o seu nivel de cortisol %n");
        cortisol = scan.nextDouble();

        resultadoExame = cortisol>= 6.0 && cortisol <=18.4;

        if (resultadoExame == true) {
            System.out.printf("O seu cortisol está num ótimo nivel! %n");
        }
        else if (cortisol<6.0){

            System.out.printf("Seu cortisol está muito baixo! %n");
        }
        else {
            System.out.printf("Seu cortisol está muito alto! %n");
        }




    }
}