package day21_MultiDimensionalArrays;

 /*
		for(DataType variableName : ArrayName ){
		}
     */

public class For_Each_Loop {

    public static void main(String[] args) {
        int[] nums  = {1, 2, 3, 4};

        for(int eachElement : nums){
            System.out.println(eachElement);
        }

        String[] students = {"Muhtar", "Asiya", "Murodil"};
        for(String eachStudent : students ){
            System.out.println(eachStudent);
        }


        int[] arr1 = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        for(int each : arr1){

            if(each < 5){
                continue;
            }

            System.out.println(each);
        }


        System.out.println("========================================================");
        String sentnce = "I like Java";   // Java like I

        String[] words =  sentnce.split(" ");  // [I, like, Java]

        for(String eachWord : words ){ // 0 ~ 2
            System.out.println(eachWord);
        }

        System.out.println("====================================");

        for(int i = words.length-1; i >= 0; i--){
            System.out.println(words[i]);
        }






    }


}
