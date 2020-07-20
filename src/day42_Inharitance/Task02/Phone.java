package day42_Inharitance.Task02;

/*
 create ba class called phone:
                attributes: brand, model, price, country, type = "Phone"
                methods: call, text,  toString
 */
public class Phone extends Device {

    /*
     brand, (Inherited)
     model, (Inherited)
     price,  (Inherited)
     country,  (Inherited)
     type = "Phone" , (Inherited)
     size (Inherited)
     setDevice ()(Inherited)
     call ()
     text,  ()
     toString (Inherited)
     */

    public Phone(String brand, String model, double price, String size){
        setDevice(brand, model, price, "Phone", size);
    }

    public void call(long number){
        System.out.println("Calling the number: "+number);
    }

    public void text(long number){
        System.out.println("texting to: "+number);
    }





}