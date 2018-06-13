package day01;
import java.util.Scanner;

public class Dayone {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("Two");
        System.out.println('t');
        System.out.println(4);

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the name:");


        //String is a class(class name begins with uppercase initial)

        //Command +Mouse over 'String' -->open declaration --> String.class


        String str= scan.nextLine();// Scanner.nextline() returns a string

        scan.close();

        System.out.println("The name that you entered:" +str);

        /*
        There types of variable:

        1 Local Variable
        2 Static/Class Variable
        3 Instance Variable
         */
    }
}
