package officeHours.SaimDay5;

public class print {

    public static void reversVoid (String[] array){

        String longest= "";
        for (String each: array){
            if (longest.length()<each.length()){
                longest = each;
            }
        }
        System.out.println(longest);

    }

    public static String reverseString (String[] array){

        String longest= "";
        for (String each: array){
            if (longest.length()<each.length()){
                longest = each;
            }
        }
        return longest;

    }

    public static void main(String[] args) {
        String[] test = {"Sue","Adilet","Rakhman","Riaz"};
        String[] test2 = {"as","aas","a","America"};

         //String result =  reversVoid(test2);



        String resul2 = reverseString(test2);
        String str = resul2.concat(" US");

        System.out.println(reverseString(test));

        System.out.println(str);



    }


}
