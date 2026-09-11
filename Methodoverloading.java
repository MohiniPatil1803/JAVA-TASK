public class Methodoverloading {
    public static void main(String[] args) {
//        mathoperations math = new mathoperations();
//
//        System.out.println(math.multiply(3,5));
//        System.out.println(math.multiply(4,6,8));
//        System.out.println(math.multiply(3.3,4.5));

        colours c = new colours();
        c.col("Red");
        System.out.println("==================");
        c.col("Red","Blue");
        System.out.println("===================");
        c.col("Red","Blue","Green");


    }
}

class colours{
    void col(String s){
        System.out.println("This colour is: "+s);
    }
    void col(String s,String b){
        System.out.println("This colour is: "+s);
        System.out.println("This colour is: "+b);
    }
    void  col(String s,String b,String g){
        System.out.println("This colour is: "+s);
        System.out.println("This colour is: "+b);
        System.out.println("This colour is: "+g);
    }
}


//class mathoperations{
//    public int multiply(int a,int b){
//        return a*b;
//    }
//    public int multiply(int a,int b,int c){
//        return a*b*c;
//    }
//    public double multiply(double a,double b){
//        return a*b;
//    }
//}
