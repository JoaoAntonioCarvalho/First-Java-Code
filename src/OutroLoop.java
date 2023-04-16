import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double somaNotas = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar");
            nota = leitura.nextDouble();
            if(nota != -1){
                somaNotas += nota;
                totalDeNotas++;
            } else {
                System.out.println("Encerrando...");
            }
        }

        double mediaNotas = somaNotas / totalDeNotas;

        System.out.println("A média das " + totalDeNotas + " notas é " + mediaNotas);
    }
}
