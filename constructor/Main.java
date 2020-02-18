package com.Jahid;

public class Main {

    public static void main(String[] args) {
        //create a new class named VipCustomer
        //create fields for customername, email,creditlimit
        //create 3 constructors
        // 1st constructor empty; should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation ,
        // test it and confirm it works




VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName()  +  customer1.getEmailaddress()  +  customer1.getCreditlimit());
VipCustomer customer2 = new VipCustomer("Jahid ", 5000.00);
        System.out.println(customer1.getName() + " " + customer2.getCreditlimit());
VipCustomer customer3 = new VipCustomer("Jahid ",  5000.00, " islamjhd35@gmail.com");
        System.out.println(customer3.getName() + customer3.getCreditlimit() + customer3.getEmailaddress());


    }
}
