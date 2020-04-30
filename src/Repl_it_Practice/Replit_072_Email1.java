package Repl_it_Practice;

import java.util.Scanner;

public class Replit_072_Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String result = "";
        String lastName = "";
        String firstName = "";
        String lastWord = "";
        String ch_ ="";

       if (email.contains("_")){

           int index_ = email.indexOf("_");
           int indexCom = email.indexOf("@");
           lastName = email.substring(index_+1,indexCom);
           firstName = email.substring(0,index_);
           lastWord = email.substring(indexCom,email.length());
           ch_ = email.substring(index_,index_+1);
           result += lastName + ch_+firstName+lastWord;



       }else {
           result = email;
       }

        System.out.print(result);


    }
}
