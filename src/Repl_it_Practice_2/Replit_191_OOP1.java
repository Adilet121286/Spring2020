package Repl_it_Practice_2;

public class Replit_191_OOP1 {
    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;


        System.out.println(a.asString());

    }
}


class Atts{
    String name;
    String color;
    int amount;

    public void setInfo(String name,String color,int amount){
        this.name=name;
        this.color = color;
        this.amount=amount;
    }

    public String asString(){
        return "name: "+name+" color: "+color+" amount: "+amount;
    }



}
