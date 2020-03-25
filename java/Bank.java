import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму: ");

        double sum = scanner.nextFloat();

        if (1 <= sum && sum < 100) {
            sum += sum * 0.05;
        } else if (100 <= sum && sum < 200) {
            sum += sum * 0.07;
        } else if (200 <= sum) {
            sum += sum * 0.1;
        } else {
            System.out.println("Ошибка ввода!");
            System.exit(0);
        }
        System.out.print("Сумма с учетом %: " + sum);
    }
}
