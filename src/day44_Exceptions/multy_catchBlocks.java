package day44_Exceptions;

import java.util.NoSuchElementException;

public class multy_catchBlocks {
    public static void main(String[] args) {

        String result = "";
        try {
            System.out.println(100 / 0);
        }catch (ClassCastException e){
            result = "Clast Cast";
        }catch(NoSuchElementException e){
            result = "No Such Element";
        }catch(IndexOutOfBoundsException e){
            result = "Index of out of bun";
        }catch(ArithmeticException e){
            result = "Arithmetic ";
        }catch (RuntimeException e){
            result = "Runtime";
        }catch(Exception e){
            result = "Exception";
        }

        System.out.println(result);


        String string = "Adilet";
        try{
            System.out.println(string.charAt(100));


        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
