package day10_Switch_Scanner;

public class numberToWords {
    public static void main(String[] args) {

        int num = -7;

        String word = (num == 0)? "Zero" : (num == 1)? "one" : (num == 2)? "tow" : (num == 3)? "three" :
                (num == 4)? "four" : (num == 5)? "fife" : (num == 6)? "six" : (num == 7)? "seven" :
                        (num == 8)? "eight" : (num == 9)? "nine" : "invalid";
        System.out.println(word);

    }
}
