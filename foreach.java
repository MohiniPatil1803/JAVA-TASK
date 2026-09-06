public class foreach {
    public static void main(String[] args) {

//
//        int num[]={78,97,67,57,78};
//
//        int max = Integer.MIN_VALUE;
//
//        for (int number:num){
//            if (number>max){
//                max=number;
//            }
//        }
//        System.out.println("Maximum number is: "+max);



        int arr[]={56,964,386,976,2346,2864};

        int min = Integer.MAX_VALUE;

        for (int num:arr){
            if (num<min){
                min=num;
            }
        }
        System.out.println("Minimun Number is:"+min);




//        int add[]={20,30,40};
//
//        int sum =0;
//        for (int a:add){
//            sum+=a;
//        }
//        System.out.println("Addition of Array is: "+sum);




//        String city[]={"Dhule","nashik","Pune","Mumbai","Banglore","Hydrabad"};
//        for (String cities:city){
//            System.out.println("All cities are: "+cities);
//        }
    }
}
