package day10_Switch_Scanner;
/*


 */

public class days {
    public static void main(String[] args) {

        int num = 4;
        String str1 = "";

        if(num>0 && num<=7){
            str1 = (num == 1) ? "Monday":(num==2)?"Tuesday":(num==3)?"Wednesday":(num==4)?"Thursday"
                    : (num==5)?"Friday":(num==6)?"Saturday":"Sunday";
        }else{
            str1 = "invalid";
        }
        System.out.println(str1);

    }
}
