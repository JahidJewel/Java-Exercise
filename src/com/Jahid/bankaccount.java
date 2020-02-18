package com.Jahid;

public class bankaccount {
    private String accountnumber;
    private float balance;
    private String customername;
    private String email;
    private String phonenumber;

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit of " +depositAmount+ "made. New balance is" +this.balance);



    }
    public void withdrawl (double withdrawalAmount){
        if (this.balance - withdrawalAmount <=0){
            System.out.println("only" + this.balance+ "available. Withdrawal not processed");

        }else {
           this.balance -=withdrawalAmount;
            System.out.println("Withdrawal of " +withdrawalAmount+ "processed. Remaining balance=" +this.balance);

        }

    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }
}
