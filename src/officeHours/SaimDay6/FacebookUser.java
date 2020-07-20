package officeHours.SaimDay6;

/*
(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
	- If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
	- Create and assign the the user's person url by taking 'facebook.com/' and adding their username
	- Set the account length to 0
	- Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
	- If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
	- Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
(*) Implement all methods coming from Social Media class
	(*) Direct messaging(String username, String message)
		- print = %message sent to %username
	(*) Post(String body)
		- Should be added to the the ArrayList of Posts of the user
	(*) Notifications(int time)
		- Checks the current time. If the time is between 8 am - 5 pm print "Notification", otherwise print "Sleep mode"
(*) Override the toString method to print all of the information of a Facebook user when they are searched.
 */

public class FacebookUser extends SocialMedia implements Groups{

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private int numberOfGroups;

    static {
        platform = "Facebook";
    }

    public FacebookUser(String username, String password) {
        setUsername(username); //java5
        setPassword(password); // kesda
        personalUrl = "Facebook.com/" + username;
        accountLength = 0;
    }

    public FacebookUser(String username, String password, String fullName) {
        this(username,password);
        setFullName(fullName);
    }

    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends) {
        this(username,password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains(username)){
            System.out.println("Invalid password, username is in password");
            password = "0000";
        }

        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        // james6 bond
        boolean isValid = true;
        String check = fullName.replace(" ","");
        for(int i=0; i < check.length(); i++) {

            if(!Character.isLetter(check.charAt(i))){
                isValid = false;
                break;
            }

        }

        if (isValid){
            this.fullName = fullName;
        } else {
            System.out.println("Not a valid name");
            this.fullName = "no name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0) {
            System.out.println("Invalid age");
            age = 0;
        }
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if(numberOfFriends > 0) {
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
            this.numberOfFriends = 0;
        }
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @Override
    public boolean directMessage(String username, String message) {

        if(message.isEmpty()) return false;

        System.out.println("Sent " + message + " to " + username);

        return true;
    }

    @Override
    public boolean createPost(String body) {
        return false;
    }

    @Override
    public void notification(int time) {

    }

    @Override
    public boolean joinGroup(String name) {
        System.out.println(fullName + " welcome to " + name);
        numberOfGroups++;
        return true;
    }

    @Override
    public boolean leaveGroup(String name) {
        System.out.println(fullName + " do you really want to leave? " + name);
        numberOfGroups--;
        return true;
    }
}
