import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double resultado;

        System.out.println("--------------GUIA PARA O CÁLCULO--------------");
        System.out.println(
                "+ = Adição \r\n" + "- = Subtração\r\n" + "x = Multiplicação\r\n" + "/ = Divisão\r\n" + "^ = Potência");

        System.out.print("Escolha uma das opções acima: ");
        char operação = scan.next().charAt(0);

        while (operação != '+' && operação != '-' && operação != 'x' && operação != '/' && operação != '^') {
            System.out.println("O símbolo da operação é inválido.");
            System.out.print("Escolha uma das opções acima: ");
            operação = scan.next().charAt(0);
        }

        System.out.print("Primeiro valor: ");
        double valor1 = scan.nextDouble();

        System.out.print("Segundo valor: ");
        double valor2 = scan.nextDouble();

        if (operação == '+') {
            resultado = valor1 + valor2;
            System.out.println(valor1 + " + " + valor2 + " = " + resultado);
        } else if (operação == '-') {
            resultado = valor1 - valor2;
            System.out.println(valor1 + " - " + valor2 + " = " + resultado);
        } else if (operação == 'x') {
            resultado = valor1 * valor2;
            System.out.println(valor1 + " X " + valor2 + " = " + resultado);
        } else if (operação == '/') {
            resultado = valor1 / valor2;
            System.out.println(valor1 + " ÷ " + valor2 + " = " + resultado);
        } else if (operação == '^') {
            resultado = Math.pow(valor1, valor2);
            System.out.println(valor1 + " ^ " + valor2 + " = " + resultado);
        }

        scan.close();
    }
}
