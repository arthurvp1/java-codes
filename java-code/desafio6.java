import java.util.Scanner;

public class desafio6 {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){

            int horas;
            float desconto,valorhora,valortotal,totaltotal;
            String nome;

            System.out.println("Qual seu nome? ");
            nome = scan.nextLine();


            System.out.println("Quanto você recebe por hora? ");
            valorhora = scan.nextFloat();

            System.out.printf("Quantas horas você trabalhou? %n ");
            horas = scan.nextInt();

            System.out.println("Qual o valor de desconto? ");
            desconto = scan.nextFloat();

            valortotal = (valorhora*horas);
            totaltotal = (valortotal-desconto);

            System.out.printf("Folha de pagamento: %s %n", nome);
            System.out.println(+horas+"horas X R$"+valorhora+" =  R$"+valortotal);
            System.out.println("Descontos: R$"+desconto);
            System.out.println("O valor devido é: "+totaltotal);
        }

    }
}
