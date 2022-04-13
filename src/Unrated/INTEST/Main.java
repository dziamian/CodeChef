package Unrated.INTEST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = 0;
        while (n-- > 0) {
            int t = scanner.nextInt();

            if (t % k == 0) {
                ++ans;
            }
        }
        System.out.println(ans);
    }
}
