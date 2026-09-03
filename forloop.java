import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//
//        System.out.println("Table of any number!....");
//        for (int i=1; i<=10 ; i++){
//            System.out.println(num+ "*" +i+ "=" + i*num );



//        for (int i=0;i<=5;i++){
//            System.out.println("Hello..Good morning");
        int sum = 0;
        for (int i = 1; i<=5; i++){
            sum +=i;

        }
        System.out.println("Total sum is: "+sum);

    }
}
