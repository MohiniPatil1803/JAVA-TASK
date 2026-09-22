class Outer{
   static class Inner{
        void showdata(){
            System.out.println("This is the Inner class Using Static keyword");
        }
    }
}
public class inner_outer {
    public static void main(String[] args) {
        //Outer o =new Outer();
        Outer.Inner i = new Outer.Inner();
        i.showdata();
    }
}
