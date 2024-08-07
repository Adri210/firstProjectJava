import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            int numeroSecreto = new Random().nextInt(100);
            int tentativas = 0;
            int numero;

            System.out.println(numeroSecreto);

            while (tentativas < 5){
                System.out.println("diga qual numero vc acha que é");
                numero = leitura.nextInt();
                tentativas++;
                if (numero == numeroSecreto){
                    System.out.println("parabens voce acertou");
                    break;
                }
                if (tentativas == 5){
                    System.out.println("suas tentativas acabaram");
                }
            }
        }
    }
