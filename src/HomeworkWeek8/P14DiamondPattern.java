package HomeworkWeek8;

import java.util.Scanner;

public class P14DiamondPattern {
    public static void diamond() {
        int k, i, j, space = 1;
        System.out.print("Input number of rows: "); // enter half of the diamond rows
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        space = k - 1;
        for (j = 1; j <= k; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= k - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (k - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        diamond();
    }
}



