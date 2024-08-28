import java.util.Scanner;

public class DesafioBissexto {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int anoDigitado, cont = 0;

        while(cont <5) {

            System.out.printf("Digite um ano: %n");
            anoDigitado = scan.nextInt();

            if (anoDigitado % 4 == 0) {
                System.out.printf("O ano é bissexto! %n");
            } else {
                System.out.printf("O ano não é bissexto! %n");
            }

            cont++;
        }


    }
}
