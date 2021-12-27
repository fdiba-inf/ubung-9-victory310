package exercise9;

import java.util.Scanner;

public class Utils {
    public static final Scanner INPUT = new Scanner(System.in);

    private static final double EPSILON = 1e-4;

    public static boolean equals(double x, double y) {
        return Math.abs(x - y) < EPSILON;
    }
}
