package HomeworkWeek8;

import java.util.Objects;
import java.util.Scanner;

//to check prime number or not
public class P12PrimeNumber {

    public static void primenum(){

        int prime;
        boolean isprime = true;
        Scanner sc = new Scanner(System.in);// for user input
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i = 2; i <=num / 2; i++){
           prime  = num % i;
           if (prime == 0){
               isprime = false;
               break;
           }
            if (isprime) //check if it is prime or not.
                System.out.println(num + " is a Prime Number");
            else
                System.out.println(num + " is not a Prime Number");
        }

        {

        }
    }

    public static void main(String[] args) {
        primenum();
    }

}
