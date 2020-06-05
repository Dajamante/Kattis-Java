import java.util.Scanner;


public class Main {
    public static final BishopPosition positionOutOfRange = new BishopPosition(-1, -1);

    public static class BishopPosition {
        public int x, y;

        public BishopPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static boolean isSame(BishopPosition attacker, BishopPosition target) {
        if (attacker.x == target.x && attacker.y == target.y) {
            System.out.println(0 + " " + (char) ('@' + target.x) + " " + target.y);
            return true;
        }
        return false;
    }

    public static boolean isSameDiagonal(BishopPosition attacker, BishopPosition target) {
        if (Math.abs(attacker.x - target.x) == Math.abs(attacker.y - target.y)) {
            System.out.println(1 + " " + (char) ('@' + attacker.x) + " " + attacker.y + " " +
                    (char) ('@' + target.x) + " " + target.y);
            return true;
        }
        return false;
    }

    public static boolean standOnDifferentColors(BishopPosition attacker, BishopPosition target) {
        if ((Math.abs(attacker.x + attacker.y) % 2) != (Math.abs(target.x + target.y) % 2)) {
            System.out.println("Impossible");
            return true;
        }
        return false;
    }

    public static BishopPosition attackWithNegativeSlope(BishopPosition attacker, BishopPosition target) {
        int x = ((attacker.y + attacker.x) - (target.y - target.x)) / 2;
        if (x < 1 || x > 8)
            return positionOutOfRange;
        int y = x + (target.y - target.x);
        if (y < 1 || y > 8)
            return positionOutOfRange;
        return new BishopPosition(x, y);
    }

    public static BishopPosition attackWithPositiveSlope(BishopPosition attacker, BishopPosition target) {
        int x = ((target.y + target.x) - (attacker.y - attacker.x)) / 2;
        int y = x + (attacker.y - attacker.x);

        return new BishopPosition(x, y);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine();  // Consume newline left-over


        for (int i = 0; i < testCases; i++) {
            char[] line = scan.nextLine().replaceAll("\\s+", "").toCharArray();

            BishopPosition attacker = new BishopPosition(line[0] - 64, line[1] - 48);
            BishopPosition target = new BishopPosition(line[2] - 64, line[3] - 48);

            if (isSame(attacker, target)) continue;
            if (isSameDiagonal(attacker, target)) continue;
            if (standOnDifferentColors(attacker, target)) continue;

            BishopPosition intersectionOfDiagonals = attackWithNegativeSlope(attacker, target);
            if (intersectionOfDiagonals == positionOutOfRange)
                intersectionOfDiagonals = attackWithPositiveSlope(attacker, target);

            System.out.println(2 + " " + (char) ('@' + attacker.x) + " " + attacker.y + " " +
                    (char) ('@' + intersectionOfDiagonals.x) + " " + intersectionOfDiagonals.y + " " + (char) ('@' + target.x) + " " + target.y);
        }

    }

}




