package Repl_it_Practice;

import java.util.Scanner;

public class Replit_076_BuildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String route = "";


        boolean startAendB = start.equalsIgnoreCase("A") && end.equalsIgnoreCase("B");
        boolean startAendC = start.equalsIgnoreCase("A") && end.equalsIgnoreCase("C");
        boolean startAendD = start.equalsIgnoreCase("A") && end.equalsIgnoreCase("D");

        boolean startBendC = start.equalsIgnoreCase("B") && end.equalsIgnoreCase("C");
        boolean startBendD = start.equalsIgnoreCase("B") && end.equalsIgnoreCase("D");
        boolean startBendA = start.equalsIgnoreCase("B") && end.equalsIgnoreCase("A");

        boolean startCendD = start.equalsIgnoreCase("C") && end.equalsIgnoreCase("D");
        boolean startCendA = start.equalsIgnoreCase("C") && end.equalsIgnoreCase("A");
        boolean startCendB = start.equalsIgnoreCase("C") && end.equalsIgnoreCase("B");

        boolean startDendA = start.equalsIgnoreCase("D") && end.equalsIgnoreCase("A");
        boolean startDendB = start.equalsIgnoreCase("D") && end.equalsIgnoreCase("B");
        boolean startDendC = start.equalsIgnoreCase("D") && end.equalsIgnoreCase("C");

        boolean found = (start.equalsIgnoreCase("A") && end.equalsIgnoreCase("A"))
                || (start.equalsIgnoreCase("B") && end.equalsIgnoreCase("B"))
                || (start.equalsIgnoreCase("C") && end.equalsIgnoreCase("C"))
                || (start.equalsIgnoreCase("D") && end.equalsIgnoreCase("D"));

        boolean total = start.equalsIgnoreCase("A") || end.equalsIgnoreCase("A")
                || start.equalsIgnoreCase("B") || end.equalsIgnoreCase("B")
                || start.equalsIgnoreCase("C") || end.equalsIgnoreCase("C")
                || start.equalsIgnoreCase("D") || end.equalsIgnoreCase("D");

        if (total){

            if (startAendB){
                route = "right: "+end+" found";
            }else if (startAendC){
                route = "right > down: "+end+" found";
            }else if (startAendD) {
                route = "right > down > left: " + end + " found";
            }else if (startBendC) {
                route = "down: " + end + " found";
            }else if (startBendD) {
                route = "down > left: " + end + " found";
            }else if (startBendA) {
                route = "down > left > up: " + end + " found";
            }else if (startCendD) {
                route = "left: " + end + " found";
            }else if (startCendA) {
                route = "left > up: " + end + " found";
            }else if (startCendB) {
                route = "left > up > right: " + end + " found";
            }else if (startDendA) {
                route = "up: " + end + " found";
            }else if (startDendB) {
                route = "up > right: " + end + " found";
            }else if (startDendC) {
                route = "up > right > down: " + end + " found";
            }else if (found) {
                route = end + " found";
            }

        }else{
            route = "Invalid Enter";
        }


        System.out.println(route);

    }
}
