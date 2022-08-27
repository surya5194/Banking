package com.suryamani;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        bank.addBranch("Bihar Sharif");
        bank.addCustomer("Bihar Sharif","Suryamani Kumar",1000);
        bank.addCustomer("Bihar Sharif","surya Kumar",100);
        bank.addCustomer("Bihar Sharif","Mani Kumar",100.30);

        bank.addBranch("Kolkata");
        bank.addCustomer("Kolkata","ABC Kumar",100.30);
        bank.addCustomer("Kolkata","XYZ Kumar",100.30);
        bank.addCustomer("Kolkata","Kumar",100.30);

        bank.listCustomers("Kolkata",true);
        bank.listCustomers("Kolkata",false);
        bank.listCustomers("Bihar Sharif",true);

        bank.addCustomerTransaction("Kolkata","Suryamani Kumar",10);
        bank.addCustomerTransaction("Kolkata","Suryamani Kumar",100);
        bank.addCustomerTransaction("Kolkata","Suryamani Kumar",10.50);
    }
}
