package InterviewCodingTasks;

/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

/*

public class StringFrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(Frequancy("AAABBCDD"));
        System.out.println("=============================");

        System.out.println(FrequancyForEach("AAABBCDD"));

    }



    public static String Frequancy(String str){


        String nondup = "";
        for (int i = 0; i<str.length();i++){
            if (!nondup.contains(""+str.charAt(i))){
                nondup +=str.charAt(i);
            }
        }

        String result = "";
        for (int l=0; l<nondup.length();l++){

            int count = 0;
            for (int i=0;  i<str.length();i++){
                if (str.charAt(i)==nondup.charAt(l)){
                    count++;
                }
            }
            result += nondup.charAt(l)+""+count;

        }

        return result;

    }

    public static String FrequancyForEach(String string){
        String nondupl = "";
        char[] ch1 = string.toCharArray();
        for (char each: ch1){
            if (!nondupl.contains(""+each)){
                nondupl += each;
            }
        }

        String resultEach = "";

        for (char eachParent: nondupl.toCharArray()){

            int count = 0;
            for (char eachChild: ch1){
                if (eachChild == eachParent ){
                    count++;
                }
            }
            resultEach += eachParent+""+count;
        }



        return resultEach;

    }

    public static String FrequacyWhile(String string){
        String result = "";
        int f=0;
        while(f<string.length()){
            int count = 0;
        }
    }
}

*/
