package Star1.Basic.SMOL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            if (k == 0) {
                System.out.println(n);
                continue;
            }

            System.out.println(n % k);
        }
    }
}