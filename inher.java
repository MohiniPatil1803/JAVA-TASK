class Animal{   //Single Inheritance
    String name;
    void eat(){

        System.out.println(name+ " is eating Food");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(name+" is barking!....");
    }
}
class Cat extends Dog{  //Multilevel Inheritance
    void meow(){
        System.out.println("Cat sounds like a meow!....");
    }
}
public class inher {
    public static void main(String[] args) {
        Cat g = new Cat();
        g.name="Buddy";
        g.eat();
        g.bark();
        g.meow();

    }
}