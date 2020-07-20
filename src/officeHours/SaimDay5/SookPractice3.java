package officeHours.SaimDay5;

public class SookPractice3 {

    public static void main(String[] args) {

        String [] words = {"Home", "car", "Cybertek","Muhtar", "Kuzzat"};

        String longest = "";
        //int i = 0;
        for ( String eachElement: words ){
            if (longest.length()<eachElement.length()){  // home, car,cybertek,
                longest = eachElement;                  // cybertek,
            }
        }

        System.out.println(longest);

        System.out.println("================================================");


        String longest2 = "";
        int num = 0;

        for (int i=0;i<words.length;i++){ // home car cybertek

            if (num < words[i].length()){

                longest2 = words[i];
                num =longest2.length(); // 8

            }
        }
        System.out.println(longest2);
        System.out.println("===============================================");


        longString(words); // because we call method with return type of String

        System.out.println(longString(words));



    }


    public static String longString(String[] useThisName){

        String result = "";
        for (String each : useThisName){
            if (result.length() < each.length()){
                result = each;
            }
        }


     return result;
    }

}
