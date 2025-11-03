package signup;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter your second name: ");
            String secondName = scanner.nextLine();

            String fullName = firstName + " " + secondName;

            System.out.println("Your full name is: " + fullName);
            System.out.println("Result: Successfully created full name!");

            scanner.close();
        }
    }


