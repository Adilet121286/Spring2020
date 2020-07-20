package day53_Iterator_Maps;

import java.lang.reflect.Array;
import java.util.*;

public class WarmUp_RemoveDuplicates {

    /*
    access-modifiers  specifier  return-type  methodsName(Parameter)
        specifiers: static, final, abstract, synchronized
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list); // thread-safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set); // thread-safe

        System.out.println("================================");

        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};  //EBADC
        LinkedHashSet<String> st = new LinkedHashSet<>( Arrays.asList(arr) );
        System.out.println(st);

       /*
        for(String each: arr){
            st.add(each);
        }
        */

        ArrayList<String> arraylist = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(arraylist);


        System.out.println(st2);

    }


    public synchronized void append(){

    }


}
