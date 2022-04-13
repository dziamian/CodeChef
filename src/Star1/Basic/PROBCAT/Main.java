package Star1.Basic.PROBCAT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int x = scanner.nextInt();

            String result;
            if (x < 100) {
                result = "Easy";
            } else if (x < 200) {
                result = "Medium";
            } else {
                result = "Hard";
            }
            System.out.println(result);
        }
    }
}