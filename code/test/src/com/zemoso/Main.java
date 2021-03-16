package com.zemoso;

public class Main {

    public static void main(String[] args) {
        PrivateTest pr = new PrivateTest();
        PublicTest pu = new PublicTest();
        DefaultTest d = new DefaultTest();
        ProtectedTest pro = new ProtectedTest();
//        pr.doesItWork();
        pu.doesItWork();
        pro.doesItWork();
        d.doesItWork();

        DriverClass dr = new DriverClass();
        dr.setUp();
        BankAccount one = new BankAccount();
        System.out.println(one.getBalance("Dhruv","1234"));
        one.sendMoney("1234");
    }
}
