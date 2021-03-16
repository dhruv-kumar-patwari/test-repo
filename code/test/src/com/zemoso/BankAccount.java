package com.zemoso;

public class BankAccount implements UPI{
    private double balance;
    private int accountID;
    private String name;
    private String PIN;

    public BankAccount(double balance, int accountID, String name, String PIN) {
        this.balance = balance;
        this.accountID = accountID;
        this.name = name;
        this.PIN = PIN;
    }

    public BankAccount() {
        this.balance = 1000;
        this.accountID = 1234;
        this.name = "Dhruv";
        this.PIN = "1234";
    }

    public double getBalance(String name, String PIN) {
        if(this.name.equals(name) && this.PIN.equals(PIN)){
            return balance;
        }
        else{
            System.out.println("Incorrect Username or Password");
            return 0.0;
        }
    }

    @Override
    public void sendMoney(String PIN) {
        if(this.PIN.equals(PIN)){
            System.out.println("You can send money!");
        }
    }
}
