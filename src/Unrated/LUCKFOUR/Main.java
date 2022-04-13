package Unrated.LUCKFOUR;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();

            int ans = 0;
            while (n > 0) {
                if (n % 10 == 4)
                    ++ans;
                n /= 10;
            }
            System.out.println(ans);
        }
    }
}