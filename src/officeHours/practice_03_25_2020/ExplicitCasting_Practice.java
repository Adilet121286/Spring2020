package officeHours.practice_03_25_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {


        byte bnum = 100;
        short snum = bnum;

        int iNum = 2000;
        short sNum = (short) iNum;
        System.out.println(sNum);

        float fNum = (float) 0.5;

        float fNum2 = (long)0.5;

        long lNum2 = (long) 4.5;



    }
}