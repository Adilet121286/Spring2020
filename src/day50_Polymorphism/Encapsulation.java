package day50_Polymorphism;

public class Encapsulation {

    private String username = "MIT";

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

}


class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        //  System.out.println( obj.username );
        System.out.println( obj.getUsername() );

        // obj.username ="Cybertek";
        obj.setUsername("Cybertek");

        System.out.println(  obj.getUsername()  );

    }
}
