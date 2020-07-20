package day45_Exceptions;

public class Warmup {
    public static void main(String[] args) {

        int pushups = 0;
        int count = 1;
        while(pushups<20){
            System.out.println(count+" Pushup");

            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }



            pushups++;
            count++;
        }

    }
}
