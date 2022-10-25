package encapsulation26;

public class TestEncapsulation extends Encapsulate {
    // String name;
    // int rollNo;
    // int age;
    public static void main(String[] args) {
        TestEncapsulation obj = new TestEncapsulation();
        //setting vale of the variables

        obj.setName("Manisha");
        obj.getAge();
        obj.setRollNo(51);

        //Displaying values of the variables

        System.out.println("Prime's name" +obj.getName());
        System.out.println("Prime's age" +obj.getAge());
        System.out.println("Prime's rollNo" +obj.getRollNo());

    }

}
