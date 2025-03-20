public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1/:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3:");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5:");
        for (int year = 1904; year <= 2096; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }

        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println("Задача 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println("Задача 8:");
        int monthlyDeposit = 29000;
        int totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings += monthlyDeposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println("Задача 9:");
        double annualInterestRate = 0.12;
        double monthlyInterestRate = annualInterestRate / 12;
        double savings = 0;

        for (int month = 1; month <= 12; month++) {
            savings += monthlyDeposit;
            savings += savings * monthlyInterestRate;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", month, savings);
        }

        System.out.println("Задача 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}