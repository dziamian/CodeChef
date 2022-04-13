package Unrated.HS08TEST;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int withdraw = scanner.nextInt();
        float balance = scanner.nextFloat();

        if (withdraw % 5 == 0 && withdraw + 0.5f <= balance) {
            balance -= withdraw;
            balance -= 0.5f;
        }

        System.out.printf(Locale.US, "%.2f", balance);
    }
}