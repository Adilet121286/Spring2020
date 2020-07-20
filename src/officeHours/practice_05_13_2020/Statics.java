package officeHours.practice_05_13_2020;

public class Statics {
    int instanceVariable = 100;
    static int staticVariable = 200;

    public static void staticMethod(){
        staticMethod();

    }

    public void instanceMethod(){
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);

    }

    public static void main(String[] args) {
        Statics statics = new Statics();
        System.out.println(staticVariable);
        System.out.println(statics.instanceVariable);
    }

}
