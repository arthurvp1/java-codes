import java.util.Scanner;

public class firstCode {
    public static void main(String[] args) {
        int tempo, vm, distancia, litros;
        char veiculo;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Você veio de onibus ou carro (o/c)");
            veiculo = scanner.next().charAt(0);
            
            if(veiculo == 'c'){
                
                
                
                System.out.println("Digite o tempo gasto na viagem (h): ");
                tempo = scanner.nextInt();
                
                System.out.println("Agora digite a velocidade média da viagem: (km)");
                vm = scanner.nextInt();
                
                distancia = (tempo*vm);
                
                System.out.println ("A distancia é: " + distancia+"km");
                
                litros = (int) (distancia/12);
                
                System.out.println("Você gastou nessa viagem, "+litros+"L de gasolina");
            }else{
                
                System.out.println("Você nao gastou nada, seu safado!");
            }
        }
        }
        
    }