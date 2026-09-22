interface Market{
    void shop();
}

interface Customer{

     void shop();
}
class Dmart implements Customer,Market{
    @Override
    public void shop(){
        System.out.println("This is the D-mart class implements by Customer,Market class");
    }
}
public class Interface_pract {
    public static void main(String[] args) {
      Dmart d = new Dmart();
      d.shop();
    }
}