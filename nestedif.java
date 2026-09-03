public class nestedif {
    public static void main(String[] args) {
        int age = 28;
        int weight = 50;

        System.out.println("Blood donation Requrirment....");
        if (age >=18){
            System.out.println("Age requirement met");

            if (weight>=50){
                System.out.println("Weight Requirement met. You are eligible to donate the blood");
            }
            else {
                System.out.println("Weight requirement not met.you must weight at least 50 kg");
            }
        }
        else {
            System.out.println("Age requrirement not met. you must be at least 18 years old");
        }
    }
}
