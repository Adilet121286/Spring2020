package day45_Exceptions;

public class ThrowsKeyword {

    public static void sleep1()  {
        try {
            Thread.sleep(3000);
        } catch(Exception e){

        }

    }


    public static void sleep2() throws InterruptedException {

        Thread.sleep(3000);

    }


    public static void main(String[] args) throws Exception {

        System.out.println("Cybetek");
        sleep2();
        System.out.println("Java");


    }


    public static void method1() throws Exception {
        String[] arr = {"A"};
        main(arr);

    }


    public static void method2(){
        try {
            method1();
        }catch(Exception e){

        }
    }

    public static void method3(){

        method2();
    }



}
