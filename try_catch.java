public class try_catch {
    public static void main(String[] args) {
        try {
            int result = 20/0;
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("Number can not divided by zero...");
        }
        try {
            int arr[]={34,78,86,86,86};
            System.out.println(arr[8]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index number does not match...");
        }
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("String is empty.,,");
        }
        finally {
            System.out.println("This is the final statement");
        }
        System.out.println("Program is continue");
    }
}
