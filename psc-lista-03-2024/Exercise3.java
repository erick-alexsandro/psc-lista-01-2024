import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva o coeficiente a: ");
        double a = scan.nextDouble();

        System.out.print("Escreva o coeficiente b: ");
        double b = scan.nextDouble();

        System.out.print("Escreva o coeficiente c: ");
        double c = scan.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau. O valor da raiz real da equação é " + (-c / b));
        }

        if (discriminante < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (discriminante == 0) {
            System.out.println(
                    "Esta equação possui duas raízes reais iguais. O valor das raízes da equação é " + (-b / (2 * a)));
        } else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            System.out.println("Raiz 1: " + (-b + Math.sqrt(discriminante)) / (2 * a));
            System.out.println("Raiz 2: " + (-b - Math.sqrt(discriminante)) / (2 * a));
        }

        scan.close();
    }
}
