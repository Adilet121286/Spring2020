package Repl_it_Practice_3;

public class Accumulator {
    int sum;

    public Accumulator(int sum){
        this.sum = sum;
    }

    public int getSum(){
        return sum;
    }

    public int add(int addNum){
        return sum+=addNum;
    }

    public int remove(int removeNum){
        return sum -= removeNum;
    }

    public String toString(){
        return "Sum is: "+this.sum;
    }



}
