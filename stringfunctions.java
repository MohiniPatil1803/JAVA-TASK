import java.util.Arrays;

public class stringfunctions {
    public static void main(String[] args) {
        String str = "I Love Java";
        String name = "How are you?...";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());

        System.out.println(name.startsWith("How"));
        System.out.println("Computer".startsWith("c"));
        System.out.println(name.endsWith("."));

        System.out.println(str.equals(name));
        System.out.println("Java".equals("java"));

        System.out.println(name.charAt(5));
        char c ="Dhule".charAt(3);
        System.out.println(c);

        int a= 456;
        String st = String.valueOf(a);
        System.out.println(a+3);
        System.out.println(st+4);

        System.out.println(name.replace("How are you","When are you from"));
        System.out.println(name.contains("How"));

        System.out.println(str.substring(2,6));


    }

}
