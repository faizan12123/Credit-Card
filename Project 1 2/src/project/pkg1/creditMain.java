/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

/**
 *
 * @author Faizan Hussain
 */
import java.util.Scanner;
public class creditMain extends CreditCard {

    public static void main(String[] args) {
        CreditCard credit = new CreditCard();
        Scanner sc = new Scanner (System.in); 
        
        
        System.out.println("Enter your name");
        String name = sc.nextLine();
        credit.setName(name);
        
                System.out.println("Enter your account number");
        String number = sc.next();
        credit.setNumber(number);
        
                System.out.println("enter your balance ");
        Double balance = sc.nextDouble();
        credit.setBalance(balance);
        
                System.out.println("Enter reward points"); 
        String points = sc.next();
        credit.setPoints(points);
        
                System.out.println("Enter due date"); 
        String date = sc.next();
        credit.setDueDate(date);
        
        System.out.println ("Name: " + credit.getName());
        System.out.println ("Account Number: " + credit.getNumber());
        System.out.println ("Balance: : " + credit.getBalance());
        System.out.println ("Reward Points: " + credit.getPoints());
        System.out.println ("Due Date: " + credit.getDueDate());
        
        System.out.println("Enter your interest rate");
       credit.interest(sc.nextDouble());
       System.out.println("Your new balance is: " + credit.getBalance());
       
       System.out.println("Enter the amount you want to charge to your card");
       credit.spentBalance(sc.nextDouble());
       System.out.println("Your new balance is: " + credit.getBalance());
       
       System.out.println("Enter payment towards credit card bill");
       credit.payment(sc.nextDouble());
       System.out.println("Your new balance: " + credit.getBalance());
       
       System.out.println("Enter how much you want to withdraw");
       credit.advance(sc.nextDouble());
       System.out.println("Your new balance is: " + credit.getBalance());
    }
    
}
