import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int numero = new Random().nextInt(100);
        System.out.println("Número gerado com sucesso. Voce tem 5 tentativas, boa sorte!");

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite seu chute");
            int chute = leitura.nextInt();

            if(chute == numero) {
                System.out.println("ACERTOU! Parabéns...");
                break;
            } else {
                if(i == 4){
                    System.out.println("Acabaram as tentativas, o número gerado foi " + numero);
                } else if( chute > numero ) {
                    System.out.println("errou... O número é menor que esse");
                } else if( chute < numero ) {
                    System.out.println("errou... O número é maior que esse");
                }
            }
        }



    }
}
