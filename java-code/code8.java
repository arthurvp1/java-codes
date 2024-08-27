import java.util.Scanner;

public class code8 {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

            float tempF, tempK;

            System.out.println("Digite a temperatura em Fahrenheit: ");
            tempF = scan.nextFloat();

            tempK = (tempF - 32)* 5 / 9 + 273.15f;

            System.out.printf("A temperatura convertida de F° para K° é: %.1f",tempK);
        }
    }
}
