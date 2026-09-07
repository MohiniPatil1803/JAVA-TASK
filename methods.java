public class methods {
    public static void main(String[] args) {

        int result = multiplication(20,40);
        System.out.println("Multiplication of two numbers is: "+result);


        msg();
        addtion(40,60);

        int result1 = Division(40,20,true);
        System.out.println("Division of two numbers is :"+result1);


    }

  static int Division(int a,int b,boolean remark){
        if (remark){
            int div=(a+b)/2;
            return div;
        }
        return 0;

  }

        static int multiplication(int a,int b) {
        System.out.println("This is parameterized function using returning values");
        int mul = a * b;
        return mul;
    }

    /* Function Using void keyword */

        static void msg(){
        System.out.println("This is the non paramaterized function using void keyword !.....");
        System.out.println("----- ----- ----- ----- ----- ----- ----- ------ ------- ------ ------- ------ ------");
    }
    static void addtion(int a,int b){
            System.out.println("This is the parameterized Function without return anything !......");
            int add = a + b;
            System.out.println("Addition of two numbers: " + add);


        }


}









