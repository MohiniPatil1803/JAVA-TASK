import java.util.*;

public class collection {
    public static void main(String[] args) {
//        ArrayList<String>names= new ArrayList<>();
//        names.add("Mohini");
//        names.add("Kirti");
//        names.add("Mohan");
//        names.add("Mohini");
//
//        System.out.println(names);
       /* System.out.println(names.get(0));*/

//
//        LinkedList<Integer> num = new LinkedList<>();
//        num.add(78);
//        num.add(89);
//        num.add(88);
//        num.add(78);
//        num.remove(0);
//
//        System.out.println(num);

//        TreeSet<Integer>obj=new TreeSet<>();
//        obj.add(876);
//        obj.add(868);
//        obj.add(789);
//        obj.add(554);
//        obj.add(868);
//
//        System.out.println(obj);

//        HashSet<String>str = new HashSet<>();
//        str.add("Dog");
//        str.add("Cat");
//        str.add("Elephant");
//        str.add("Rabbit");
//        str.add("Dog");
//
//        System.out.println(str);

        HashMap<Integer,String>value = new HashMap<>();
        value.put(54,"Mohini");
        value.put(78,"Rakesh");
        value.put(98,"Nayan");

        System.out.println(value.get(78));
        System.out.println(value);

    }
}
