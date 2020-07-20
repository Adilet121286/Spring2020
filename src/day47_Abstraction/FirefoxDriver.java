package day47_Abstraction;

public final class FirefoxDriver extends RemoteWebDriver{


    @Override
    public void get(String URL){
        System.out.println("Opening "+URL+" in firefox browser");
    }

    @Override
    public void quit(){
        System.out.println("Closing firefox browser");
    }

}
