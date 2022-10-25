package HomeworkWeek8;

import java.util.Scanner;

public class P6TrianglePattern {
    public static void test() {
        int i, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int m = sc.nextInt();

        for (i = 1; i <= m; i++) {
            for (x = 1; x <= i; x++) {
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        test();
    }
}
