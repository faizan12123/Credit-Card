/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.pkg1;

/**
 *
 * @author faiz_on
 */
public class CreditCard {
private String name;
    private String number;
    private String dueDate;
    private String points;
    private double balance;
    
            void spentBalance(double spent) {
        this.setBalance(getBalance() + spent);
        }
        void advance ( double advance) {
            this.setBalance (getBalance () + advance); 
        }
        void payment (double pay) {
            this.setBalance (getBalance()- pay);
        }
        void interest ( double interest ) { 
            this.setBalance((getBalance()* interest/100) + getBalance()); 
        }
        
    String getName (){
        return name;
        
    }
    
    void setName (String name) {
        this.name = name; 
    }
    void setNumber ( String nunber) {
        this.number = number; 
    }
    String getNumber (){
        return number; 
    }
        void setDueDate ( String dueDate) {
        this.dueDate = dueDate; 
    }
    String getDueDate (){
        return dueDate; 
    }
        void setPoints ( String points) {
        this.points = points; 
    }
    String getPoints (){
        return points; 
    }
        void setBalance ( double balance) {
        this.balance = balance; 
    }
    double getBalance (){
        return balance; 
    }


}
