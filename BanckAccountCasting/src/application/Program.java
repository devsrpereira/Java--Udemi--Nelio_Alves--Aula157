package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001,"Alex", 0);
        BusinessAcount bacc = new BusinessAcount(1100, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(1101, "João", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1200, "Pedro", 0.0, 500.0);

        //DOWNCASTING
        BusinessAcount acc4 = (BusinessAcount) acc2;
        acc4.loan(100.);

//        BusinessAcount acc5 = (BusinessAcount) acc3;
        if(acc3 instanceof BusinessAcount){
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updade!");
        }




    }
}
