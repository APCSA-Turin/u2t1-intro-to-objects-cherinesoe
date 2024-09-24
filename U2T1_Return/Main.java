package U2T1_Return;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChatBot debbie = new ChatBot("debbie", 3,1);
        
        System.out.print("What is your name?: ");
        String name = scan.nextLine();

        debbie.greeting(name);
        String empty = scan.nextLine();

        debbie.weather();
        
        System.out.print("I can convert feet to meters! Enter an amount of feet: ");
        int feet = scan.nextInt();
        scan.nextLine();
        System.out.println(feet + " feet is " + debbie.convertFeetToMeters(feet) + " meters!");

        System.out.print("What is your favorite number: ");
        int favoriteNum = scan.nextInt();
        scan.nextLine();
        debbie.favoriteNumber(favoriteNum);

        System.out.println("The sum of is 114, 334, and 584 is " + debbie.addNumbers(114, 334, 584));

        System.out.println(debbie.doubleAge() + " days is double my age!");
        
        System.out.print("What is your favorite hobby?: ");
        String hobby = scan.nextLine();
        System.out.println(debbie.favHobby(hobby));

        System.out.print("How old are you?: ");
        int age = scan.nextInt();
        scan.nextLine();

        debbie.ageOfRobot(age);

        System.out.println("In five days I will be " + debbie.num4() + " days old.");

        System.out.print("What is your favorite color? "); 
        String color = scan.nextLine();

        System.out.println(debbie.favColor(color));

        System.out.print("Enter any integer: ");
        int num = scan.nextInt();
        scan.nextLine();
        debbie.favNum2(num);

        System.out.println(debbie.goodbye());
    }
}
