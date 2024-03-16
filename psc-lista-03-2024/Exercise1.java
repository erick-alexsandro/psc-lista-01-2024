import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.print("Escreva o segundo número: ");
        double n2 = scan.nextDouble();

        System.out.print("Escreva o terceiro número: ");
        double n3 = scan.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }

        if (n1 < n2 && n1 < n3) {
            System.out.println("O menor número é: " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("O menor número é: " + n2);
        } else {
            System.out.println("O menor número é: " + n3);
        }

        System.out.println("A média aritmética é: " + (n1 + n2 + n3) / 3);

        scan.close();
    }
}