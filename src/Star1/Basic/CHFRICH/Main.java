package Star1.Basic.CHFRICH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x = scanner.nextInt();

            System.out.println((b - a) / x);
        }
    }
}