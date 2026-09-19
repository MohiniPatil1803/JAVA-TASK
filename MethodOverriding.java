class add{

    void addition(int a, int b){
        System.out.println("Addition of two numbers is: "+(a+b));
    }
}

class add1 extends add{
    @Override
    void addition(int a, int b){
        System.out.println("Addition of two numbers is: "+(a+b));
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        add1 a = new add1();
        a.addition(34,89);
        a.addition(56,67);


    }
}
