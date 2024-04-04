import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int tentativa = 0;
        int num = new Random().nextInt(100);

        while (tentativa < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            int numDigitado = leitor.nextInt();
            tentativa++;

            if (numDigitado == num){
                System.out.println("Parabéns vc acertou o número.");
                break;
            } else if (numDigitado < num){
                System.out.println("O número digitado é maior.");
            } else {
                System.out.println("O número digitado é menor.");
            }
        }

        if (tentativa == 5) {
            System.out.println("Vc nao conseguiu adivinhar o número! O número era: " + num);
        }
    }
}