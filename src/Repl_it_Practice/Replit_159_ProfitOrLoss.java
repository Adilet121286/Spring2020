package Repl_it_Practice;

public class Replit_159_ProfitOrLoss {
    public static String c_profits (int buyPrice,int sellPrice){
        //your code here

        if (buyPrice<sellPrice){
            return "profit";
        }else if(buyPrice>sellPrice){
            return "loss";
        }else {
            return "no loss";
        }

    }

    public static void main(String[] args) {

        String result = c_profits(10,8);
        System.out.println(result);

    }
}
