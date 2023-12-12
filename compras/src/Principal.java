import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0){
            leitura.nextLine();
            System.out.print("Digite a descrição da compra: ");
            String descricao = leitura.nextLine();

            System.out.print("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);
             if (cartao.lancaCompra(compra)){
                 System.out.println("Compra realizada!");
                 System.out.println("Digite 0 para sair ou 1 para continuar!");
                 sair = leitura.nextInt();
             } else {
                 System.out.println("Saldo insuficiente!");
                 sair = 0;

             }
        }

        System.out.println("-----------------------------");
        System.out.println("COMPRAS REALIZADAS: ");

        Collections.sort(cartao.getCompras());

//        cartao.getCompras().sort(Comparator.comparing(Compra::getValor));

        for (Compra c : cartao.getCompras()){
            System.out.println(c);
        }

        System.out.println("\n-----------------------------");

        System.out.println("\nSALDO DO CARTÃO: " + cartao.getSaldo());
    }
}
