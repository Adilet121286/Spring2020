package Repl_it_Practice;

import java.util.Scanner;

public class Replit_163_ValidateTask {

    public static void main(String[] args) {
        boolean emptyYesNo=true;
        int taskID = 3;
        int currentID = 2;

        boolean result = validateTask(emptyYesNo,taskID,currentID);
        System.out.println(result);

    }


    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        boolean truefalse = true;

        if (notEmpty==true){
            if (taskId == currentId+1){
                truefalse = true;
            }else {
                truefalse = false;
            }
        }else {
            truefalse = false;
        }

        return truefalse;


    }
}
