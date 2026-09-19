class demo{
    private String password;

    public void setPassword(String p){
        password="6436514w25";
    }
    public String getPassword(){
        return password;
    }

}
public class encapsulation {
    public static void main(String[] args) {
        demo d= new demo();
        d.setPassword("6436514w25");
        System.out.println("Password is: "+d.getPassword());

    }
}
