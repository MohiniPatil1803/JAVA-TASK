//class parent{
//    int x=40;
//}
//
//class child extends parent{
//    int x=20;
//
//    void display(){
//        System.out.println("Child class value :"+x);
//        System.out.println("Parent class value: "+super.x);
//    }
//}
//public class supers {
//    public static void main(String[] args) {
//        child c = new child();
//        c.display();
//    }
//}




class Vehicle{
    String type ="Genaric Vehicle";

    Vehicle(String brand){
        System.out.println("Vehicle constructor call for: "+type);
    }
    void displayinfo(){
        System.out.println("This is the Vehicle method");
    }

}
class Car extends Vehicle{
    String type ="Car";

    Car(String brand){
        super(brand);
        System.out.println("Car constructor called");
    }
    @Override
    void displayinfo(){
        System.out.println("This is the car method");
    }
    void showdetails(){
        System.out.println("Sub class  type: "+this.type);
        System.out.println("Parent class type: "+super.type);

        this.displayinfo();
        super.displayinfo();
    }
}
public class supers {
    public static void main(String[] args) {
        Car c= new Car("Toyata");
        c.showdetails();

    }
}