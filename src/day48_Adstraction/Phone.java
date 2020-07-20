package day48_Adstraction;

/*
 1. create an abstract class called Phone
            attributes: brand, model, price, size
            abstract methods: calling(), texting()
            instance method: toString()
 */

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phoneNumber);

    public abstract void texting(long phoneNumber);

    public String toString(){
        return "Brand : "+ brand + ", Model: "+model+", Price : $"+price + ", Size: "+size;
    }
}
