package HomeworkWeek8;

import java.util.Scanner;

public class P8RightangleTriangle {

    public static void rightAngle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows : ");
        int angle = sc.nextInt();

        for (int i = 1; i <= angle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('@');
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        rightAngle();
    }

}
