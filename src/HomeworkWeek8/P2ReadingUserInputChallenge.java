package HomeworkWeek8;

import java.util.Scanner;

public class P2ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Create a new object for Scanner class
        int sum = 0;
        int count = 1;

        while (count <= 10) {
            System.out.println("Enter number #" + count);

            boolean ans = sc.hasNext();
            if (ans) {
                int number = sc.nextByte();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine();
        }
        System.out.println("Sum of all number = " + sum);
        sc.close();
    }
}