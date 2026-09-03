import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int c = a+b;

        System.out.println("Your result is: "+c);

        sc.close();









//        System.out.println("Enter Your name");
//        String name = sc.nextLine();
//
//        System.out.println("Enter your age");
//        int age = sc.nextInt();
//
//        System.out.println("Your name is: "+name);
//        System.out.println("Your age is: "+age);

    }
}
