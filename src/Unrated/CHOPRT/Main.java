package Unrated.CHOPRT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (Integer.compare(a, b)) {
                case 1: System.out.println(">");
                break;
                case 0: System.out.println("=");
                break;
                case -1: System.out.println("<");
                break;
            }
        }
    }
}