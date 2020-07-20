package officeHours.SaimDay6;

public class User {
    public static void main(String[] args) {
        FacebookUser user = new FacebookUser("java5", "kesda");
        user.setPassword("java5");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        FacebookUser user2 = new FacebookUser("jamesB", "pass007", "Jam7es Bond");

        System.out.println(user2.getUsername());
        System.out.println(user2.personalUrl);
        System.out.println(user2.accountLength);
        System.out.println(user2.getFullName());
    }
}
