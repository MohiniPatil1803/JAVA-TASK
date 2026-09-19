class car {
    //Default constructor
//class Student{
//    String name;
//    int age;
//
//    Student(){
//        name ="Mohini;";
//        age =23;
//    }
//    void display(){
//        System.out.println(name);
//        System.out.println(age);
//    }
//}
    String brand;
    int year;

    car(String carbrand, int caryear) {  //Parameterized Constructor
        brand = carbrand;
        year = caryear;
    }

    void displayinfo() {
        System.out.println("My car name is: " + brand);
        System.out.println("Year of my car: " + year);
    }
}

public class constructor {
    public static void main(String[] args) {
//        Student s = new Student();  // Default Constructor
//        s.display();
        System.out.println("Cars Record!...");
        car c= new car("Audi",2024);
        car c1=new car("BMW",2021);
        c.displayinfo();
        System.out.println("==============================");
        c1.displayinfo();

    }
}



