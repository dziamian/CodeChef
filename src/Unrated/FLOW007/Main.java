package Unrated.FLOW007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();

            StringBuilder ans = new StringBuilder();
            while (N > 0) {
                ans.append(N % 10);
                N /= 10;
            }
            System.out.println(Integer.parseInt(ans.toString()));
        }
    }
}