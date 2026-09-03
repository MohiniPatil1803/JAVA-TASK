public class whileloop {
    public static void main(String[] args) {


//        for (int i=1;i<=10 ;i++){
//            if (i == 2 || i == 6)
//                continue;
//            System.out.println(i+ " Roll Number");
//
//        }


        int i =0;

        while (i<=10){
            i++;
            if (i==3 || i==9){
                continue;
            }
            System.out.println("Good morning " +i);
        }
    }
}


