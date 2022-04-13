package Star1.Basic.PROGLANG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            HashSet<Integer> usedLanguage = new HashSet<>(Arrays.asList(scanner.nextInt(), scanner.nextInt()));

            int ans = 0;
            for (int i = 0; i < 2; ++i) {
                HashSet<Integer> newLanguage = new HashSet<>(Arrays.asList(scanner.nextInt(), scanner.nextInt()));

                if (newLanguage.containsAll(usedLanguage)) {
                    ans = i + 1;
                }
            }
            System.out.println(ans);
        }
    }
}