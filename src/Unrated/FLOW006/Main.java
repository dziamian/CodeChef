package Unrated.FLOW006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();

            int ans = 0;
            while (N > 0) {
                ans += N % 10;
                N /= 10;
            }
            System.out.println(ans);
        }
    }
}
