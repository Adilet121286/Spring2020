package Repl_it_Practice_2;

public class Replit_Pizza {
    private String size;
    private int cheese, pepperoni,ham;

    public Replit_Pizza (String size, int cheese, int pepperoni, int ham){
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;

    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    public double calcCost(){

        double cost = 0;

        if (size.equals("small")){
            cost = (cheese+pepperoni+ham) * 2 + 10;
        }

        if (size.equals("medium")){
            cost = (cheese+pepperoni+ham) * 2 + 12;
        }

        if (size.equals("large")){
            cost = (cheese+pepperoni+ham) * 2 + 14;
        }

        return cost;

    }

    public String toString(){
        return size+ " Pizza with "+cheese+" Cheese toppings, "+pepperoni
                +" Pepperoni toppings, and "+ham+" Ham toppings."+"\nTotal Price: "+calcCost();

    }


}
