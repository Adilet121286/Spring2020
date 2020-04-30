package Repl_it_Practice;

public class Replit_167_RemoveDuplicates {

    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("AAbbhhjPPOOx") ) ;

        System.out.println(unicWhile("AAbbhhjPPOOx"));

        System.out.println(unicWhile2("AAbbhhjPPOOx"));

        System.out.println(RemuveDulicates("java"));
    }


    public static String uniqueChars(String str) {
        //TODO: write your below

        String result = "";


        for (int k = 0; k<=str.length()-1; k++){

            int count = 0;

            for (int i = 0; i<=str.length()-1; i++){
                if (str.charAt(i) == str.charAt(k)){
                    count++;
                }

            }
            if (count ==1){
                result += str.charAt(k);
            }

        }
        return result;



    }

    public static String unicWhile(String str){

        String[] Unic = str.split("");


        String result = "";

        for (String each2: Unic){

            int count = 0;
            for (String each: Unic){
                if (each.equals(each2)){
                    count++;
                }

            }
            if (count==1){
                result +=each2;
            }

        }

        return result;
    }

    public static String unicWhile2(String str){

        String result = "";


        int h = 0;
        while (h<str.length()){

            int count = 0;
            int i = 0;
            while (i<str.length()){

                if (str.charAt(i) == str.charAt(h)){
                    count++;
                }
                i++;

            }
            if (count == 1){
                result += str.charAt(h);
            }
            h++;

        }

        return result;



    }

    public static String RemuveDulicates (String str){

        String result = "";

        for (int i=0; i<=str.length()-1; i++){
        /*
            if (!result.contains(""+str.charAt(i)))
            result +=str.charAt(i);
        */

        if (result.contains(""+str.charAt(i))){
            continue;
        }

        result +=str.charAt(i);


        }
        return result;


    }



}

