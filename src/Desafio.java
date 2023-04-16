import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //iniciando

        String nome = "João Antonio de Moraes Carvalho";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome:             " + nome);
        System.out.println("Tipo conta:       " + tipoDeConta);
        System.out.println("Saldo inicial:    R$ " + saldo);
        System.out.println("************************************************");

        int opcaoEscolhida = 0;

        while(opcaoEscolhida != 4) {
            System.out.println("\n\n\nOperações\n");

            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção desejada:");
            opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorAReceber = leitura.nextDouble();

                    saldo += valorAReceber;

                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorATransferir = leitura.nextDouble();

                    if(valorATransferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                        System.out.println("Saldo disponível R$ " + saldo);
                    } else {

                        //transferir
                        saldo -= valorATransferir;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    };

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:

                    System.out.println("Opção inválida");
            }
        }
    }
}
