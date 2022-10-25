package encapsulation26;

public  class ConstructorOverloadingExample25 {
    //Java program to overload constructors
        int id;
        String name;
        int age;

        //creating two arg constructor
        public ConstructorOverloadingExample25(int i, String n) {
            id = i;
            name = n;

        }

        //creating three arg constructor
        public ConstructorOverloadingExample25(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        public void display() {System.out.println(id + " " + name + " " + age);}


        public static void main(String args[]) {
            ConstructorOverloadingExample25 s1 = new ConstructorOverloadingExample25(111,"Karan");
            ConstructorOverloadingExample25 s2 = new ConstructorOverloadingExample25(222,"Aryan", 25);
            s1.display();
            s2.display();

        }
    }
