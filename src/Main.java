import java.util.Scanner;
class Main {
public static void main(String[] args) {
     Scanner Number = new Scanner(System.in);
     int number = Number.nextInt();

        // checks if number is greater than 0
        if (number > 0) {
        System.out.println("The number is positive.");
        }

        // execute this block
        // if number is not greater than 0
        else {
        System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");
        }
        }

