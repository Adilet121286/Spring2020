package Repl_it_Practice_3;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public Carpet (){
        width = 300;
        length = 300;
        totalPrice = 200;
        isPersian = false;
        unitPrice = 0;
    }

    public Carpet(double width, double length, double unitPrice, double totalPrice,boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.isPersian = isPersian;

        totalPrice = (isPersian)? (width+length)*unitPrice+200 : (width+length)*unitPrice;

    }



}
