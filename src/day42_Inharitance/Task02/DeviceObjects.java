package day42_Inharitance.Task02;

public class DeviceObjects {
    public static void main(String[] args) {


        TV tv = new TV("Samsung", "E250", 500, "40 inches");
        tv.country = "USA";
        System.out.println(tv);

        Phone phone1 = new Phone("Iphone","11",1000,"large");

        System.out.println(phone1);

    }
}