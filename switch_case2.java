import java.util.Scanner;

public class switch_case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Your Department");

        System.out.println("Computer");
        System.out.println("Mechanical");
        System.out.println("Electrical");
        System.out.println("Civil");
        System.out.println("Automobile");
        System.out.println("Chemical");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Your department is computer");
                break;
            case 2:
                System.out.println("Your department is Mechanical");
                break;
            case 3:
                System.out.println("Your department is electrical");
                break;
            case 4:
                System.out.println("Your department is Civil");
                break;
            case 5:
                System.out.println("Your department is Automobile");
                break;
            case 6:
                System.out.println("Your department is chemical ");
                break;
            default:
                System.out.println("Invalid Department");



        }
        System.out.println("Thank you so much!......");
    }
}
