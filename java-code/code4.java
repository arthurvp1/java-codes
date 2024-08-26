import java.util.Scanner;

public class code4{
 
    public static void main(String[] args) {
       try(Scanner scan = new Scanner(System.in)){
           float celcius,kelvin;

           System.out.println("||  Conversor de temperatura  ||");

           System.out.println("Digite a temperatura em C° ");
           celcius = scan.nextFloat();

           kelvin = (float) celcius + 273.15f;

           System.out.println("A temperatura em Kelvin é "+kelvin+"K°");
       }


    }
}