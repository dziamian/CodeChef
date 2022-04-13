package Star1.Basic.IMDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            int ans = 0;
            for (int i = 0; i < n; ++i) {
                int s = scanner.nextInt();
                int r = scanner.nextInt();

                if (x >= s && r > ans) {
                    ans = r;
                }
            }
            System.out.println(ans);
        }
    }
}