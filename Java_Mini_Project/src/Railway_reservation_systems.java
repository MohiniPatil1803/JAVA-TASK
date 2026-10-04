import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Reservation{
    private int reservation_id;
    private String passangername;
    private int age;
    private String gender;
    private int trainNumber;
    private String trainName;
    private String source;
    private String destination;
    private String journeydate;
    private String classtype;
    private double fare;

    public Reservation(int reservation_id,String passangername,int age,String gender,
                       int trainNumber,String trainName,String source,String destination,
                       String journeydate,String classtype,double fare){
        this.reservation_id = reservation_id;
        this.passangername = passangername;
        this.age = age;
        this.gender=gender;
        this.trainNumber= trainNumber;
        this.trainName=trainName;
        this.source = source;
        this.destination = destination;
        this.journeydate= journeydate;
        this.classtype=  classtype;
        this.fare = fare;

    }
public int getReservation_id(){
        return reservation_id;
}
public String getPassangername(){
        return passangername;
}
public int getAge(){
        return age;
}
public String getGender(){
        return gender;
}
public int getTrainNumber(){
        return trainNumber;
}
public String getTrainName(){
        return trainName;
}
public String getSource(){
        return source;
}
public String getDestination(){
        return destination;
}
public String getJourneydate(){
        return journeydate;
}
public String getClasstype(){
        return classtype;
}
public double getFare(){
        return fare;
}




public void setReservation_id(int reservation_id){
       this.reservation_id = reservation_id;
}
public void setPassangername(String passangername){
        this.passangername = passangername;
}
public void setAge(int age){
        this.age=age;
}
public void setGender(String gender){
        this.gender=gender;
}
public void setTrainNumber(int trainNumber){
        this.trainNumber=trainNumber;
}
public void setTrainName(String trainName){
        this.trainName=trainName;
}
public void setSource(String source){
        this.source=source;
}
public void setDestination(String destination){
        this.destination=destination;
}
public void setJourneydate(String journeydate){
        this.journeydate=journeydate;
}
public void setClasstype(String classtype){
        this.classtype=classtype;
}
public  void setFare(double fare){
        this.fare=fare;
}

public void displayReservation(){
    System.out.println("======================================");
    System.out.println("Reservation Id: "+reservation_id);
    System.out.println("Passanger Name: "+passangername);
    System.out.println("Passanger Age: "+age);
    System.out.println("Gender: "+gender);
    System.out.println("Train Number: "+trainNumber);
    System.out.println("Train Name: "+trainName);
    System.out.println("Source: "+source);
    System.out.println("Destination: "+destination);
    System.out.println("Journey Date: "+journeydate);
    System.out.println("Class: "+classtype);
    System.out.println("Fare: "+fare);
    System.out.println("==========================================");
}
public String toString(){
        return reservation_id+"," +passangername+ "," +age+ "," +gender+ "," +trainNumber+ "," +trainName+
                "," +source+ "," +destination+ "," +journeydate+ "," +classtype+ "," +fare;
}
}

public class Railway_reservation_systems {
    static ArrayList<Reservation> reservations = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String FIle_NAME = "reservations.txt";

    public static void main(String[] args) {
        loadReservations();
        int choice;

        do {
            displayMenu();

            try {
                System.out.println("Enter Your Choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        addReservation();
                        break;

                    case 2:
                        viewReservations();
                        break;
                    case 3:
                        searchReservation();
                        break;
                    case 4:
                        updateReservation();
                        break;
                    case 5:
                        deleteReservation();
                        break;
                    case 6:
                        saveReservations();
                        System.out.println("Data Saved Successfull.y");
                        System.out.println("Thank you for using Railway Reservation System!");
                        break;
                    default:
                        System.out.println("Invalid choice!...");
                }
            } catch (Exception e) {
                System.out.println("Invalid Output!...");
                sc.nextLine();
                choice = 0;
            }
        }
        while (choice != 6);
        sc.close();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("=================================");
        System.out.println("RAILWAY RESERVATION SYSTEM ");
        System.out.println("=====================================");
        System.out.println("1. Add Reservation");
        System.out.println("2. View all reservations");
        System.out.println("3. Search Reservation");
        System.out.println("4. Update Reservation");
        System.out.println("5. Delete Reservation");
        System.out.println("6. Exit");
        System.out.println("=================================");
    }

    public static void addReservation() {
        System.out.println();
        System.out.println("============ADD RESERVATION================");
        try {
            System.out.print("Enter reservation Id: ");
            int id = sc.nextInt();

            for (Reservation r : reservations) {
                if (r.getReservation_id() == id) {
                    System.out.println("Reservation Id already exists!.....");
                    return;
                }
            }
            sc.nextLine();

            System.out.println("Enter Passenger name: ");
            String name = sc.nextLine();

            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.println("Enter Train Number: ");
            int trainNumber = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Train Name: ");
            String trainName = sc.nextLine();

            System.out.println("Enter Source: ");
            String source = sc.nextLine();

            System.out.println("Enter Destination: ");
            String destination = sc.nextLine();

            System.out.println("Enter journey Date: ");
            String journeyDate = sc.nextLine();

            System.out.print("Enter Class (Sleeper/3AC/2AC/1AC): ");
            String classType = sc.nextLine();

            System.out.println("Enter fare: ");
            double fare = sc.nextDouble();

            if (age <= 0) {
                System.out.println("Age must be greater trhan 0");
                return;
            }
            if (trainNumber <= 0) {
                System.out.println("Train Number must be greater than 0");
                return;
            }
            if (fare < 0) {
                System.out.println("fare cannot be negative");
                return;
            }
            Reservation reservation = new Reservation(
                    id, name, age, gender, trainNumber, trainName, source,
                    destination, journeyDate, classType, fare
            );
            reservations.add(reservation);
            saveReservations();

            System.out.println("Reservation Added Successfully!...");


        } catch (Exception e) {
            System.out.println("Invalid input!...");
            sc.nextLine();
        }
    }

    public static void viewReservations() {
        System.out.println();
        System.out.println("====================ALL RESERVATIONS=========================");

        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }
        for (Reservation r : reservations) {
            r.displayReservation();
        }
    }

    public static void searchReservation() {
        System.out.println();
        System.out.println("===================SEARCH RESERVATION============");

        try {
            System.out.println("Enter Reservation Id: ");
            int id = sc.nextInt();
            boolean found = false;

            for (Reservation r : reservations) {
                if (r.getReservation_id() == id) {
                    r.displayReservation();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Reservation not found.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input!....");
            sc.nextLine();
        }
    }

    public static void updateReservation() {
        System.out.println();
        System.out.println("===========================UPDATE RESERVATION=======================");

        try {
            System.out.println("Enter Reservation Id: ");
            int id = sc.nextInt();
            boolean found = false;

            for (Reservation r : reservations) {
                if (r.getReservation_id() == id) {
                    found = true;
                    sc.nextLine();

                    System.out.print("Enter New Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter New Train Number: ");
                    int trainNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Train Name: ");
                    String trainName = sc.nextLine();

                    System.out.print("Enter New Source: ");
                    String source = sc.nextLine();

                    System.out.print("Enter New Destination: ");
                    String destination = sc.nextLine();

                    System.out.print("Enter New Journey Date: ");
                    String journeyDate = sc.nextLine();

                    System.out.print("Enter New Class: ");
                    String classType = sc.nextLine();

                    System.out.print("Enter New Fare: ");
                    double fare = sc.nextDouble();

                    if (age <= 0) {
                        System.out.println("Invalid age!...");
                        return;
                    }
                    if (trainNumber <= 0) {
                        System.out.println("Invalid Train Number!...");
                        return;
                    }
                    if (fare < 0) {
                        System.out.println("Invalid fare.");
                        return;
                    }
                    r.setPassangername(name);
                    r.setAge(age);
                    r.setGender(gender);
                    r.setTrainNumber(trainNumber);
                    r.setTrainName(trainName);
                    r.setSource(source);
                    r.setDestination(destination);
                    r.setJourneydate(journeyDate);
                    r.setClasstype(classType);
                    r.setFare(fare);

                    saveReservations();
                    System.out.println(
                            "Reservation updated successfully!"
                    );
                    break;
                }
            }
            if (!found) {
                System.out.println("Reservation not found...");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input!...");
        }
    }
    public static void deleteReservation(){
        System.out.println();
        System.out.println("====================DELETE RESERVATION=========================");

        try {
            System.out.println("Enter Reservation Id: ");
            int id= sc.nextInt();
            boolean found =false;

            for (int i=0;i<reservations.size();i++){
                if (reservations.get(i).getReservation_id()==id){
                    reservations.remove(i);
                    saveReservations();

                    System.out.println("Reservations Deleted successfully!....");

                    found=true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Reservation not found!....");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input!.....");
            sc.nextLine();
        }
    }
    public static void saveReservations(){
        try {
            FileWriter writer= new FileWriter(FIle_NAME);

            for (Reservation r:reservations){
                writer.write(r.toString() + "\n");
            }
            writer.close();

        }
        catch (IOException e){
            System.out.println("Error While Saving Data.");
        }
    }
    public static void loadReservations(){
        File file = new File(FIle_NAME);

        if (!file.exists()){
            return;
        }
        try {
            BufferedReader reader= new BufferedReader(new FileReader(FIle_NAME));

            String line;
            while ((line=reader.readLine())!=null){
                String [] data=line.split(",");

                if (data.length==11){
                    int id= Integer.parseInt(data[0]);
                    String name = data[1];
                    int age=Integer.parseInt(data[2]);
                    String gender = data[3];
                    int trainNumber=Integer.parseInt(data[4]);
                    String trainName= data[5];
                    String source = data[6];
                    String destination = data[7];
                    String journeyDate = data[8];
                    String classType = data[9];
                    double fare = Double.parseDouble(data[10]);

                    Reservation reservation = new Reservation(
                            id, name, age, gender, trainNumber, trainName,
                            source, destination, journeyDate, classType, fare
                    );

                    reservations.add(reservation);
                }

            }
            reader.close();
        }
        catch (IOException | NumberFormatException e){
            System.out.println("Error While Loading Data......");
        }
    }
}