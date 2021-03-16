package com.zemoso;
interface ins {
    void method();
}
class Test implements ins {
    public void method() {
        System.out.println("This works!");
    }
}
public class interfaceInstance {
    public static void main(String[] args) {
        ins obj = new Test();
        obj.method();
    }
}