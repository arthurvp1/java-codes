import java.util.Scanner;

public class code7{
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            float kelvin, celcius;


            System.out.println("Digite a temperatura em K°: ");
            kelvin = scan.nextFloat();

            celcius = (kelvin -273.15f);


            System.out.printf("A temperatura convertida de K° para C° é: %.0f", celcius);

        }



    }
}