package Unrated.FLOW010;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Character, String> ships = new HashMap<Character, String>() {{
        put('B', "BattleShip"); put('b', "BattleShip");
        put('C', "Cruiser"); put('c', "Cruiser");
        put('D', "Destroyer"); put('d', "Destroyer");
        put('F', "Frigate"); put('f', "Frigate");
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        while (T-- > 0) {
            Character n = scanner.next().charAt(0);

            System.out.println(ships.get(n));
        }
    }
}