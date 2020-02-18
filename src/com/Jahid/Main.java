package com.Jahid;

public class Main {

    public static void main(String[] args) {
        //create a new class for a bank account
        //create fields for account number, balance, customername, email,phone number
        //create getters and setters for each fields
        //create two additional methods
        //1. To allow the customer to deposit funds (this method should increment the balance filed)
        //2. To allow the customer to withdraw funds. This should deduct from the balance field
        //don't allow to withdraw if there is not suffient funds

       bankaccount Jahidaccount = new bankaccount();
       Jahidaccount.withdrawl(100.0);

       Jahidaccount.deposit(50.0);
       Jahidaccount.withdrawl(40.0);

       Jahidaccount.deposit(51.0);





    }
}
