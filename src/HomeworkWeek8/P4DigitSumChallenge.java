package HomeworkWeek8;

import java.util.Scanner;

public class P4DigitSumChallenge {
    public static int SumDigits(int n) {
        int ans = 0;
        while (n>0){
            ans += n % 10; // To extract least - significant digit
            n /=10; // Discard the least-significant digit
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt(); // n=digit
        System.out.println("The sum is : " + SumDigits(n));
    }

}
