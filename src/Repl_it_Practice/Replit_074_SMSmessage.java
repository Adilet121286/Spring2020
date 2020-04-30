package Repl_it_Practice;

/*
    Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
 */

import java.util.Scanner;

public class Replit_074_SMSmessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;



       sender = "Sender: ".concat(message.substring(message.indexOf("<")+1, message.indexOf('>')));
       phoneNumber ="Phone Number: ".concat(message.substring(message.indexOf("[")+1,message.indexOf("]")));
       messageBody ="Message body: ".concat(message.substring(message.indexOf("{")+1, message.indexOf("}")));


        System.out.println(sender);
        System.out.println(phoneNumber);
        System.out.println(messageBody);



    }
}
