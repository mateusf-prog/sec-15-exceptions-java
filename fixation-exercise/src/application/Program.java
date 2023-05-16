package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawErrorException;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter account data ---");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        System.out.println();
        
        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: $ %.2f%n", account.getBalance());
        }
        catch (WithdrawErrorException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}