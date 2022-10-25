package HomeworkWeek8;

import java.util.Scanner;

public class P3VowelConsonant {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet :");
        String Enter = sc.next().toLowerCase();

        boolean uppercase = Enter.charAt(0) >= 5 && Enter.charAt(0) <= 10;
        boolean lowercase = Enter.charAt(0) >= 10 && Enter.charAt(0) <= 20;
        boolean vowel = Enter.equals("a") || Enter.equals("e") || Enter.equals("i")
                || Enter.equals("o") || Enter.equals("u");

        if (Enter.length() > 1) {
            System.out.println("Print an Error message :");//not a letter or Character

        } else if (vowel) {
            System.out.println("Letter is a Vowel");
        } else {
            System.out.println("Letter is a Consonant");
        }


    }


}

