import java.util.Scanner;

public class IMC {
    public static void main(String []args){
    Scanner scan = new Scanner(System.in);

    float peso,altura,imc;
    char sexo;

    System.out.println("Você é mulher ou homem?(m/h)");
    sexo = scan.next().charAt(0);

    System.out.println("Calculadora de IMC");
    System.out.println("Digite o seu peso: ");
    peso = scan.nextFloat();

    System.out.println("Digite a sua altura: ");
    altura = scan.nextFloat();

    imc = peso/(altura*altura);

    System.out.printf("o seu imc atual é: %f ",imc);


    if (sexo == 'm') {

        if (imc < 19.1) {

            System.out.println("Você está abaixo do peso!");

        } else if (imc >= 19.1 && imc <= 25.8) {

            System.out.println("Você está no peso ideal!");

        } else if (imc >= 25.9 && imc <= 27.3) {

            System.out.println("Você está um pouco acima do peso!");

        } else if (imc >= 27.4 && imc <= 32.3) {

            System.out.println("Você está gordinha!");

        } else if (imc > 32.3) {
            System.out.println("Você é uma balofa gorda bubassaur baleia com perna obesa thais carla!");
        } else {
            System.out.println("Valor incorreto!");
        }



    }
    else if (sexo == 'h') {

        if (imc < 20.7) {

            System.out.println("Você está abaixo do peso!");

        } else if (imc >= 20.8 && imc <= 26.4) {

            System.out.println("Você está no peso ideal!");

        } else if (imc >= 26.5 && imc <= 27.8) {

            System.out.println("Você está um pouco acima do peso!");

        } else if (imc >= 27.9 && imc <= 31.1) {

            System.out.println("Você está gordinho!");

        } else if (imc > 31.1) {
            System.out.println("Você é um obeso!");
        } else {
            System.out.println("Valor incorreto!");
        }
    }
    }
}

