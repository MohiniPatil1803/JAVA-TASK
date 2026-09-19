import org.w3c.dom.ls.LSOutput;

class Atm{
    private int ATM_PIN=2003;

    public int getATM_PIN(){
        return ATM_PIN;
    }
}

public class data_hiding {
    public static void main(String[] args) {
        Atm a = new Atm();
        System.out.println(a.getATM_PIN());
    }

}
