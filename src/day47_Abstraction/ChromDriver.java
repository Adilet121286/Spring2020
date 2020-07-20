package day47_Abstraction;

public final class ChromDriver extends RemoteWebDriver{

    @Override
    public void get(String URL){
        System.out.println("Opening "+URL+" in chrome");

    }

    @Override
    public void quit(){
        System.out.println("Closing chrome browser");

    }



}
