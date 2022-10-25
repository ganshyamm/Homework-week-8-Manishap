package HomeworkWeek8;

import java.util.Scanner;

public class P9FibonacciNumber {

    public static void fibonacci() {
        int num1 = 0, num2 = 1, num3, i, count;
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter Fibonacci Series length : ");
        count = sc.nextInt();
        for (i = 2; i < count; ++i) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }

}
