package day41_Inheritance;

public class AudioBook extends Book{
     /*
    title (Iherited)
    author (Iherited)
    price (Iherited)
    length (declared)
    listen() (declared)
    toString() (Iherited)
     */

    public String length;

    public void listen(){
        System.out.println("Listening to "+title);
    }
}
