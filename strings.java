public class strings {
    public static void main(String[] args) {
        String str ="Mohini";

        String str2 ="Mohini";

        String str3 = new String("Mohini");


        if (str==str3){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }

        if (str.equals(str3)){
            System.out.println("Yes both string are same!....");
        }
        else {
            System.out.println("Not same!.....");
        }

    }
}
