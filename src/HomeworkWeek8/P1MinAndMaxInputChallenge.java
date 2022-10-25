package HomeworkWeek8;

import java.util.Scanner;

public class P1MinAndMaxInputChallenge {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int Minimum = Integer.MAX_VALUE;
        while (true){
            System.out.println("Enter Number :");
            boolean Isnt = sc.hasNext();
            if (Isnt){
                int number = sc.nextInt();
                if (number > maximum) {
                    maximum = number;
                }
                if (number < Minimum) {
                     Minimum = number;
                }else {
                    System.out.println("Invalid number :");
                    break;
                }
                sc.nextLine();
            }

            System.out.println("Maximum : = " + maximum + " and Minimum : = " + Minimum);
            sc.close();
            }

            }
        }


