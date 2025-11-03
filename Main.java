package secondproject.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        //taking input for account number
        System.out.println("enter your account number:");
        String acc_no=sc.next();
        //taking input for balance
        System.out.println("enter your balance amount:");
        double amt=sc.nextDouble();
        char repeat;

        //creating on object of account
        Account a1=new Account (name,acc_no,amt);
        do {
            System.out.println("Welcome to Deerwalk Bank:");
            System.out.println("***************");
            System.out.println("1. Balance enquiry\n2.Deposit\n3.Withdraw");

            System.out.println("Enter your choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter your balance is:" + a1.balanceEnquiry());
                    break;
                case 2:
                    System.out.println("Enter amount for deposit");
                    double amt1 = sc.nextDouble();
                    a1.deposit(amt1);
                    break;
                case 3:
                    System.out.println("Enter the amount for withdraw");
                    double amt2 = sc.nextDouble();
                    a1.withdraw(amt2);
                    break;
                default:
                    System.out.println("Invalid option");
            }

            System.out.println("do you want to continue?(Y/N)");
            repeat = sc.next().charAt(0);

        }while(repeat=='Y');
        System.out.println("Thank you for using Application");
        System.out.println("Tata Bye ");


    }
}
