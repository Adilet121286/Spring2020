package day13_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {

        String str = "Cybertek School is the best";
            //        012345678
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 0123456789

        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(7,12);

        System.out.println(firstName);
        System.out.println(lastName);

        // full name = first name + last name
        // gmail: lastname_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        String firstname = Murtaza.substring(0,7);
        String lastname = Murtaza.substring(8,15);

        System.out.println(firstname);
        System.out.println(lastname);

        String gmail = lastname.concat("_").concat(firstName).concat("@gmail.com");

        System.out.println(gmail);

        String s1 = "I love Java Programming Languaje";

        String className = s1.substring(7);
        System.out.println(className);

        String s2 = "I like C# Programming";
        s2 = s2.replace("C#", "Java");

        System.out.println(s2);

        String name = "COVID 18";
        name = name.replace("18", "19");

        System.out.println(name);

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replace("C#", "Java");

        System.out.println(r1);

        String r2 = "Tomorrow is Moday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);



    }
}
