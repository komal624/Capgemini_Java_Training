package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program displays a calendar for a given month and year
 * using Gregorian calendar logic.
 */
public class Calendar {

    static String[] months = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };

    static int[] days = {
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    public static boolean leap(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static int firstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int d = days[m - 1];
        if (m == 2 && leap(y)) d = 29;

        System.out.println("\n" + months[m - 1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(m, y);

        for (int i = 0; i < start; i++)
            System.out.print("    ");

        for (int i = 1; i <= d; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0)
                System.out.println();
        }

        sc.close();
    }
}
