package Repl_it_Practice_2;

public class Replit_Assessment2_AppearsTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String senten = "    ";
        String target = " ";
        boolean result = appearsTwice(target,senten);
        System.out.println(result);
    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {

        String[] array1 = sentence.split(" ");
        int count = 0;
        for (String each : array1) {
            if (each.contains(target)) {
                each = each.replaceFirst(target, "");
                count++;

            }
        }
        if (count > 1) {
            return true;
        } else {
            return false;
        }



    }
}
