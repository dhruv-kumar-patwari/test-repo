package com.zemoso.newPack;
import com.zemoso.*;

public class Checker {
    public static void main(String[] args) {
        PrivateTest pr = new PrivateTest();
        PublicTest pu = new PublicTest();
        DefaultTest d = new DefaultTest();
        ProtectedTest pro = new ProtectedTest();
//        pr.doesItWork();
        pu.doesItWork();
//        pro.doesItWork();
//        d.doesItWork();
    }
}
