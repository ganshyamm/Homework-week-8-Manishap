package HomeworkWeek8;

public class P13SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); //input/output
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int lastDigit = number1 % 10;
        int lastDigit2 = number2 % 10;
        int firstDigit = number1 / 10;
        int firstDigit2 = number2 / 10;

        return lastDigit == lastDigit2 || lastDigit == firstDigit2 || firstDigit == lastDigit2 || firstDigit == firstDigit2 || number1 == number2;
    }
}


