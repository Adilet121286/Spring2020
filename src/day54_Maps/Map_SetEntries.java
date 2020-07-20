package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {
        LinkedHashMap <String, String> facebook = new LinkedHashMap<>();
        facebook.put("Tester_1", "password_1");
        facebook.put("Tester_2", "password_1");
        facebook.put("Tester_2", "password_2");
        facebook.put("Tester_3", "password_3");
        facebook.put("Tester_4", "password_4");
        facebook.put("Tester_5", "password_5");

        System.out.println(facebook);
        System.out.println("====================================================");

        for ( String eachKey : facebook.keySet() ) {
            //System.out.println(eachKey + " "+ facebook.get(eachKey));
            System.out.println(eachKey);
        }

        List<String> username = new ArrayList<>(facebook.keySet());
        System.out.println(username);

        System.out.println("====================================================");
        facebook.values();

        for (String eachValue : facebook.values()){
            System.out.println(eachValue);
        }

        List<String> password = new ArrayList<>(facebook.values());
        System.out.println(password);
        System.out.println("====================================================");





    }
}
