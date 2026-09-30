public class methods2 {
    static void animal(){
        System.out.println("this is the Animal Method");
    }

    static void name(String s){
        System.out.println("My name is " +s);
    }

    static int addition(int a,int b){
        int add = a+b;
        return add;
    }
    public static void main(String[] args) {
        animal();

        name("Mohini");

        int result = addition(30,56);
        System.out.println("Addition of two numbers is: "+result);
    }
}
