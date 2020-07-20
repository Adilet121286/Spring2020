package Repl_it_Practice_3;

public class GasTank {
    //WRITE YOUR CODE HERE

    double amount = 0;
    double capacity;

    public GasTank(double capacity){
        this.capacity = capacity;
    }

    public void addGas(double increase){
        if (capacity<increase){
            amount += capacity;
        }else{
            amount +=increase;
        }
    }
    public void useGas(double decrease){
        if (amount-decrease<0){
            amount =0;
        }else {
            amount -= decrease;
        }
    }

    public boolean isEmpty(){
        if (amount < 0.1){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        if (amount>0.1){
            return true;
        }else {
            return false;
        }
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        return capacity - amount;
    }




}