@FunctionalInterface
interface addition{

    int add(int a,int b);
}

public class lamda {
    public static void main(String[] args) {
        addition d = (a,b) -> a + b;
        System.out.println("Addition of lamda Expression: "+d.add(20,70));
    }
}
