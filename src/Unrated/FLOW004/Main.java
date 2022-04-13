package Unrated.FLOW004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();

            int ans = n % 10;
            while (n > 9) {
                n /= 10;
            }
            ans += n;
            System.out.println(ans);
        }
    }
}