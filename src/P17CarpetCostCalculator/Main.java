package P17CarpetCostCalculator;

public class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " +  calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        Floor F2= new Floor(5.4,4.5);
        Carpet C2= new Carpet(1.5);
        Calculator home2= new Calculator(F2,C2);
        System.out.println("the total price of the house carpet coverage is given by "+ home2.getTotalCost());



    }
}


