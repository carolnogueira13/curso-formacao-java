import javax.swing.plaf.IconUIResource;
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100);
        int cont = 0;

        System.out.println("""
                Bem-vindo ao programa de adivinhação
                Você tem até 5 chances para acertar o número
                """);

        while (cont <= 4){
            System.out.print("Tente adivinhar o numero (" + (cont + 1) +
                    " tentativa): ");
            int numero = leitura.nextInt();
            if (numero == aleatorio){
                System.out.println("Parabéns acertou o numero");
                break;
            }
            if (numero > aleatorio){
                System.out.println("O número digitado é maior do que o " +
                        "número para adivinhar");
            } else {
                System.out.println("O número digitado é menor do que o " +
                        "número para adivinhar");
            }
            cont++;
        }

        if (cont == 5){
            System.out.println("Infelizmente você não acertou o número");
            System.out.println("O número era " + aleatorio);
        }
    }
}
