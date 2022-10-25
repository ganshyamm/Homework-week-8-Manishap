package HomeworkWeek8;

import java.util.Scanner;

public class P10ArmstrongNumber {

    public static void armstrong() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int i, remainder, result = 0;
        i = num;
        while (i !=0){
            remainder = i % 10;
            result += Math.pow(remainder,3);
            i /= 10;
        }
        if (result == num)
            System.out.println(num + "is an Armstrong number");
        else
        System.out.println(num + "is not an armstrong number");

    }

    public static void main(String[] args) {
        armstrong();
    }
}
