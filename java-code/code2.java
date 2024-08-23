import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            float tempC, tempF;
            System.out.println("Digite a temperatura em Celcius");
            tempC = scanner.nextFloat();
            tempF = (9* tempC + 160) /5;
            System.out.println("A temperatura em F é "+tempF+"F");
        }

    }
}
