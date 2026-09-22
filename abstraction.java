abstract class School{
    abstract void attendance();

    void display(){
        System.out.println("This is School class....");
    }
}
class Student extends School{
    void attendance(){
        System.out.println("This is the Student class...");
    }

}
public class abstraction {
    public static void main(String[] args) {
        Student s =new Student();
        s.attendance();
        s.display();
    }
}
