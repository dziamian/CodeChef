package Star1.Basic.VDATES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int d = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            if (d > r) {
                System.out.println("Too Late");
            } else if (d < l) {
                System.out.println("Too Early");
            } else {
                System.out.println("Take second dose now");
            }
        }
    }
}