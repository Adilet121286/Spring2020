package Repl_it_Practice_3;

public class Value {
    private int val = 0;
    private boolean wasModified = false;
    //WRITE YOUR CODE HERE

    public Value(){

    }

    public Value(int value){
        this.val = value;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int newVal){
        this.val = newVal;
        this.wasModified = true;
    }

    public boolean wasModified(){
        return wasModified;
    }




}
