package U2T1_Return;

public class ChatBot {

    // instance variables
    private String name;
    private int number;
    private int age;
 
    // constructor
    public ChatBot(String chatBotName, int faveNum, int chatBotAge) {
        name = chatBotName;
        number = faveNum;
        age = chatBotAge;
    }
 
    // void method that prints a greeting
    public void greeting(String yourName) {
        System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
        System.out.println("and I am a chat bot! How are you today?");
    }
 
    // void method that prints the weather
    public void weather() {
        System.out.println("I actually don't know much about the weather! Ha ha!");
        System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
    }
 
    // method that converts feet to meters and returns the meters
    public double convertFeetToMeters(int numFeet) {
        final double METERS_PER_FOOT = 0.3048;
        return METERS_PER_FOOT * numFeet;
    }
 
    // void method that prints information about favorite numbers
    public void favoriteNumber(int yourNumber) {
        int distance = yourNumber - number;  // number is an instance variable
        System.out.println("My favorite number is " + number);
        System.out.println("That is " + distance + " away from your number!");
    }
 
    // method that adds and returns the sum of three numbers
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
 
    // method that returns a goodbye message -- note that this method does not print a string, but
    // rather RETURNS a string
    public String goodbye() {
        return "It was nice talking with you! Have a great day! Sincerely, " + name;
    }

    // Cherine's Methods

    // method that returns double the robots age
    public int doubleAge() {
        return age * 2;
    }

    // method that returns robots favorite hobby
    public String favHobby(String hobby) {
        return "Wow, " + hobby + " is cool! My favorite hobby is chatting with other people!";
    }

    public void ageOfRobot(int userAge) {
        System.out.println(userAge + " years is a lot of days. I am only " + age + " day(s) old.");
    }
    
    // Evelyn's Methods
    public int num4() {
        return 5 + age;
    }

    public String favColor(String color) {
        return "My favorite color is also " + color;
    }

    public void favNum2 (int num2){
        System.out.println ("My second favorite number is " + (num2 + age));
    }
}