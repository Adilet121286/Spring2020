package day22_Arrays_Loop;

public class Java_Paython {
    public static void main(String[] args) {
        String sentences = "I like java and javascript javajava";
        int countJava = 0;
        int countPython = 0;


        String[] words = sentences.split(" ");

        for (String eachWord:words){
            if (eachWord.contains("java")){

                countJava++;

            }
            if (eachWord.contains("python")){
                countPython++;
            }

        }
        System.out.println(countJava);
        System.out.println(countPython);



    }
}
