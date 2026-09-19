class office{
    int id;
    String Department="Testing";

    office(int i){
        id =i;
    }
    void show(){
        System.out.println("Employee id is: "+id+ " and Employee Department is: "+Department);
    }
}
public class static_keyword {
    public static void main(String[] args) {
        office o = new office(22);
        o.show();

        office a1 =new office(25);
        a1.show();
    }

}
