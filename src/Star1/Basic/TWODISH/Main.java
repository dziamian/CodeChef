package Star1.Basic.TWODISH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (n > Math.min(a + c, b)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}