package Repl_it_Practice_2;

public class Replit_168_cover {
    public static void main(String[] args) {
        System.out.println(coverString("Certified Wooden Spoon", "o") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {

        String cover="["+ coverME +"]";
        String result = "";
        if (main.contains(coverME)){
            result = main.replace(coverME,cover);
        }
        if (!main.contains(coverME)){
            result = main;
        }
        return result;

    }
}
