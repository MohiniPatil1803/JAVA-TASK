import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your city: ");
        sc.nextLine();
        String city=sc.nextLine();


        try {
            FileWriter fileWriter = new FileWriter("myfile.txt");
            fileWriter.write("Name:" +name+"\n");
            fileWriter.write("Age"+age+"\n");
            fileWriter.write("City"+city+"\n");

            fileWriter.close();

            System.out.println("Data Inserted Successfully...");
        }
        catch (IOException e){
            System.out.println("An error Occured..");
            e.printStackTrace();
        }


//        try {                                         // for creating a file
//            File file = new File("myfile.txt");
//            if (file.createNewFile()){
//                System.out.println("Files created Successfully..");
//            }
//            else {
//                System.out.println("Files already exists..");
//            }
//        }
//        catch (IOException e){
//            System.out.println("An error occured");
//            e.printStackTrace();
//        }
    }
}
