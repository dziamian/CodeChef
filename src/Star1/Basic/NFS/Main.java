package Star1.Basic.NFS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int U = scanner.nextInt();
            int V = scanner.nextInt();
            int A = scanner.nextInt();
            int S = scanner.nextInt();

            String result = "Yes";
            if (U > V) {
                double v2 = U * U - 2 * A * S;
                if (v2 >= 0 && Math.sqrt(v2) > V) {
                    result = "No";
                }
            }
            System.out.println(result);
        }
    }
}