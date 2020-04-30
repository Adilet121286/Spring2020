package officeHours.practice_03_11_2020;

public class LiraToUSD {
    public static void main(String[] args) {
        int lira = 100;
        double rate = 0.16097;
        double USD = lira*rate;
        String equal = " lira equal to";
        String lastWord = " USD";

        System.out.println(lira+equal+USD+lastWord);
    }
}
