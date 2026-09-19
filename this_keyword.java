class department{
    String college;
    int college_id;

    department(String college,int college_id){
        this.college = college;
        this.college_id=college_id;
    }
    void display(){
        System.out.println(college);
        System.out.println(college_id);
    }
}
public class this_keyword {
    public static void main(String[] args) {
        department d=new department("K.K.Wagh",375643);
        d.display();
    }
}