package com.Jahid;

public class VipCustomer {
    private String name;
    private double creditlimit;
    private String emailaddress;

    public VipCustomer(){
        this("default name ",  5000.00,
                " default@gmail.com");

    }

    public VipCustomer(String name, double creditlimit) {
       this(name, creditlimit,"unknown@gmail.com");
    }

    public VipCustomer(String name, double creditlimit, String emailaddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }
}
