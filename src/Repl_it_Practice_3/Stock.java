package Repl_it_Practice_3;

public class Stock {

    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
    }

    public double marketCap(double res){
        return totalShares * price;
    }

    public String toString(){
        return "Ticker Symbol: "+tickerSymbol+"\nCompany: "+companyName
                +"\nCurrent Price: "+price+"\nMarket Cap: "+marketCap;
    }







    // DO NOT CHANGE THE METHOD BELOW
    public void adjustPrice(int value){
        int temp=price;
        price=price+(value);
        percentChange=((double)(price-temp))/temp;
        marketCap=totalShares*price;
    }















}
