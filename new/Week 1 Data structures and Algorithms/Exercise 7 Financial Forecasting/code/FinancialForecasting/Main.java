import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual growth rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        Forecast forecast = new Forecast();

        double result1 = forecast.futureValueRecursive(principal, rate, years);
        System.out.println("Future Value (Recursive): " + result1);

        Double[] memo = new Double[years + 1];
        double result2 = forecast.futureValueMemo(principal, rate, years, memo);
        System.out.println("Future Value (Memoized): " + result2);

        scanner.close();
    }
}
