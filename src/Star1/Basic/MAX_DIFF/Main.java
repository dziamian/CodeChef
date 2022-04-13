package Star1.Basic.MAX_DIFF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();

            System.out.println(n - Math.abs(n - s));
        }
    }
}