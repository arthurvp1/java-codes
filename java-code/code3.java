import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        
        float tempC, tempF, valorfinalfloat;
        int valorfinal;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a temperatura em F: ");
            tempF = scanner.nextFloat();
            
            tempC = ( ( tempF - 32 ) * 5) / 9;

            valorfinal = Math.round(tempC);

            valorfinalfloat = (float) valorfinal;
            
            System.out.println("A temperatura em Celcius é "+valorfinalfloat+" C°");
        }

    }
}


//formula = C = ( (F - 32) * 5 ) / 9