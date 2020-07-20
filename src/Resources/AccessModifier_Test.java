package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // System.out.println(obj.defaultAccess); only accessable in the package.
        System.out.println(obj.publicAccess);


    }
}
