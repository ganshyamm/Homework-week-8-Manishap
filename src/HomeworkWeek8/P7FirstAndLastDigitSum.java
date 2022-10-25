package HomeworkWeek8;

import java.util.Scanner;

public class P7FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        int lastdigit = 0;
        if (num >= 0) {
            lastdigit = num % 10;
            while (num > 9) {
                num = num / 10;

            }
            System.out.println("First Number " + num + " Last Number " + lastdigit + " Total = " + (num + lastdigit));
            return 0;

        } else
            System.out.println(-1);
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 to 4 digit number :");
        int num = sc.nextInt();
        sumFirstAndLastDigit(num);
    }


}
