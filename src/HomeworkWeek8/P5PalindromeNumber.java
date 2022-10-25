package HomeworkWeek8;

import java.util.Scanner;

public class P5PalindromeNumber {
    public static boolean palindrome(int number) {
        int num = number;
        int reverse = 0;

        //It should return true if the number is a palindrome number otherwise it should return false.
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;

        }if(num == reverse){ // if both are the same then the number is palidrome otherwise it it not
            return true;

        }else

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int palindrome = sc.nextInt();
        System.out.println(palindrome);

    }
}

