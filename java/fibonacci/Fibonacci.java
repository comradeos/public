public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Fibonacci:");

        long num1 = 1;
        long num2 = 1;

        System.out.println(num1);
        System.out.println(num2);

        for (int i = 1; i <= 100; i++) {
            long num3 = num1 + num2;

            System.out.println(num3);

            num1 = num2;
            num2 = num3;
        }
    }
}
