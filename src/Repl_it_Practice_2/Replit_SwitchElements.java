package Repl_it_Practice_2;

import java.util.Arrays;
import java.util.Collections;

public class Replit_SwitchElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println(     Arrays.toString(do_switch(array))   );


    }



    public static int[] do_switch(int[] i) {

        int saveFirst = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = saveFirst;
        return i;






    }
}
