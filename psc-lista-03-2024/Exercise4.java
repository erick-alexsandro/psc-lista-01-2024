import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado;

        System.out.println("--------------GUIA PARA O CÁLCULO--------------");
        System.out.println("1: calcular e imprimir o perímetro do círculo.\r\n" + //
                "2: calcular e imprimir a área do círculo.\r\n" + //
                "3: calcular e imprimir o volume da esfera.");

        System.out.print("Escolha uma das opções acima: ");
        int operação = scan.nextInt();

        while (operação != 1 && operação != 2 && operação != 3) {
            System.out.println("Código da operação é inválido.");
            System.out.print("Escolha uma das opções acima: ");
            operação = scan.nextInt();
        }

        System.out.print("Segundo valor: ");
        double valor = scan.nextDouble();

        if (operação == 1) {
            resultado = 2 * Math.PI * valor;
            System.out.println("Perímetro do círculo: " + resultado);
        } else if (operação == 2) {
            resultado = Math.PI * Math.pow(valor, 2);
            System.out.println("Área do círculo: " + resultado);
        } else if (operação == 3) {
            resultado = (4.0 / 3.0) * Math.PI * Math.pow(valor, 3);
            System.out.println("Volume da esfera: " + resultado);
        }

        scan.close();
    }
}
