package officeHours.SaimDay7;

import officeHours.SaimDay6.SocialMedia;

public class TryCatch {

    public static void main(String[] args) {


        try {
            String s = "abc";
            System.out.println(s.charAt(30));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("after catch block");
        }



    }
}
