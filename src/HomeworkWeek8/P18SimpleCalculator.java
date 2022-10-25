package HomeworkWeek8;

public class P18SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public static void main(String[] args) {

        P18SimpleCalculator calculator = new P18SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0;
        } else {
            return (this.firstNumber / this.secondNumber);
        }
    }
}


