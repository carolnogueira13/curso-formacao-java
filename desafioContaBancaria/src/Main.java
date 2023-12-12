import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Ana Caroline Nogueira";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println();

        System.out.println("**************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n**************************************");

        String menu = """
                Digite a sua opção:
                1 - Consultar saldo
                2 - Sacar
                3 - Depositar
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2){
                System.out.print("Qual o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3){
                System.out.print("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção inválida");
            }

        }

    }
}