import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] money = new double[] { 50, 20, 10, 5, 2, 1 };

        System.out.print("Valor pago: ");
        double pricePayed = scan.nextDouble();

        System.out.print("Valor da compra: ");
        double price = scan.nextDouble();

        double change = pricePayed - price;

        System.out.println("Troco: " + change);

        int[] moneyTimes = new int[money.length];

        if (change != 0) {
            for (int i = 0; i < money.length; i++) {
                while (change >= money[i]) {
                    moneyTimes[i]++;
                    change -= money[i];
                }
                System.out.println("Notas de R$" + money[i] + ": " + moneyTimes[i]);
            }
        }

        scan.close();
    }
}
