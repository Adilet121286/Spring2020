package day10_Switch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        byte a = 4;

        switch (a){
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Tow");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

                default:
                    System.out.println("Invalid case");
                    break;

        }

    }
}
