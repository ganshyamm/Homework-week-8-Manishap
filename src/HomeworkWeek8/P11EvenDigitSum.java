package HomeworkWeek8;

import java.util.Enumeration;
import java.util.Scanner;

public class P11EvenDigitSum {
    public static int getEvenDigitSum(int num) {


        int total = 0;
        if (num > 0) {
            while (num != 0) {
                int even = num % 10;


                if (even % 2 == 0) {
                    total += even;
                }
                num /= 10;
            }
            System.out.println(total);
        } else {
            System.out.println(-1 + " = Number is Invalid");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(-22);

    }


}
