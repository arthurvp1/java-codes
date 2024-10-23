package Module5;

public class Main {

    public static void main(String[] args) {

       CreateClass meuCarro = new CreateClass();
       CreateClass seuCarro = new CreateClass();

       meuCarro.modelo = "bmw";

        System.out.printf("Modelo : %s%n", meuCarro.modelo);
        System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);

    }
}
