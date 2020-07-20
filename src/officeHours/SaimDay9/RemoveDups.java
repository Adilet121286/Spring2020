package officeHours.SaimDay9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDups {
    /*
    * Create a method that will accept a String
    * and returns a version that removes duplicate
    * instances of any character
    Ex: removeDup("AAABBBCCCD") ==> ABCD
     */

    public static void main(String[] args) {

        System.out.println(removeDup("aaaasssdddfffdreggg"));

    }


    public static String removeDup (String str){

        return new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();


    }
}
