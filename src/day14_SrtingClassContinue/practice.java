package day14_SrtingClassContinue;

public class practice {
    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);       // false

        if(result){
            System.out.println("Logged in");
        }

        System.out.println("====================");

        String webAddress = "www.amazon.com";

        if (webAddress.startsWith("www.")){
            //      true
            System.out.println("valid");
        }

        System.out.println("====================");

        String email = "CybertecShool@yahoo.com";

        if (email.endsWith("@gmail.com")){
            System.out.println("Valid Gmail address");
        }else {
            System.out.println("INVALID");
        }

        System.out.println("====================");

        String str2 = "www.bibi.com";

        if(str2.startsWith("www.") && str2.endsWith(".com") || str2.endsWith(".net") || str2.endsWith(".edu")
                || str2.endsWith(".Gov")){
            System.out.println("valid web address");
        }else {
            System.out.println("Invalid web address");
        }




    }
}
