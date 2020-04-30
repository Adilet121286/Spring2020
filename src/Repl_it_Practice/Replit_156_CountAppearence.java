package Repl_it_Practice;

public class Replit_156_CountAppearence {

    public static void main(String[] args) {

        String[] array = {"a", "food", "bar", "food", "bla"};
        String word = "food";

        int appearence = count_appearance(array,word);

        System.out.println(appearence);


    }

    public static int  count_appearance(String[] arr, String t) {

        //end  count_appearance\

        int countString = 0;
        for (String each : arr){
            each.toLowerCase();
            if(t.equals(each)){
                countString++;
            }
        }

        return countString;





    }
}
