import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("you are eligible");
        }
        else {
            System.out.println("You are not eligible");
        }

//        int a = 10;
//        if (a>=18){
//            System.out.println("You are eligible fotr voting");
//        }
//        else {
//            System.out.println("You are not eligible for voting ");
//        }


//        int a = 30;
//        if (a>=18){
//            System.out.println("You are eligiblle for voting");
//        }
    }
}