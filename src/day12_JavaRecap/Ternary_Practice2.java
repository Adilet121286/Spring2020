package day12_JavaRecap;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        char ch1 = 'A';

        String result = (ch1 == 'A') ? "A is selected" : (ch1 == 'B')? "A is selected"
                : (ch1 == 'C') ? "C is selected" : (ch1 == 'D')? "D is selected"
                :(ch1 == 'E') ? "E is selected": "Invalid character";
        System.out.println(ch1);


    }
}
