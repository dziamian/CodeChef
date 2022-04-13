package Unrated.FLOW013;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b + c == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}