import java.util.Scanner;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        int n1 = scan.nextInt();

        System.out.print("Escreva o segundo número: ");
        int n2 = scan.nextInt();

        int menor = (n1 < n2) ? n1 : n2;
        int maior = (n1 > n2) ? n1 : n2;

        Random random = new Random();
        int numSorteio = random.nextInt((maior - menor) + 1) + menor;

        System.out.println("Resultado do sorteio: " + numSorteio);

        if (numSorteio % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scan.close();
    }
}
