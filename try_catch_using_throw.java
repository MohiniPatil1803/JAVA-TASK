public class try_catch_using_throw {
    static void checkage (int age) throws Exception{
        if (age<18){
            throw new Exception("Age is less than 18... so You are not eligible...");
        }
        System.out.println("You are eligible");
    }

    public static void main(String[] args) {
        try {
            checkage(30);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }



//        int age = 20;    Using throw keyword exception
//        try {
//            if (age < 18){
//                throw new ArithmeticException("Not Eligible");
//            }
//            System.out.println("Eligible");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Not Eligible");
//        }


    }
}
