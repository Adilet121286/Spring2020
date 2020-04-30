package day19_arrays;

public class Array_Practice1 {
    public static void main(String[] args) {

        String[] friends = {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
        //          0          1         2        3        4             5           6

        /*
        System.out.println(   friends[6]   );
              String s1 =    friends[2];
        System.out.println(s1);
         */

        for (int i = 0; i <= 6; i++) {
            String name = friends[i];
            System.out.println(name);
        }


        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        // print out all the users who regsitered with thier gmail

        //  max:  4

        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }

        }



    }
}
