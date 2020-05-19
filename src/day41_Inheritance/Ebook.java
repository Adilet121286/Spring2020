package day41_Inheritance;

public class Ebook extends Book{
     /*
    title (inherited)
    author (inherited)
    price (inherited)
    toString() (inherited)
    size (declared)
    pages (declared)
    readbook()
     */

    public String size;
    public int pages;

    public void readbook(){
        System.out.println("reading "+title);
    }


}
