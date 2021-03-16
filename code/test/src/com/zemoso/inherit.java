package com.zemoso;

public class inherit {
    public static void main(String[] args) {
        D d = new D();
        d.method();
    }
}
// Single Inheritance
class A{
    public void method(){
        System.out.println("Class A");
    }
}
class E extends A{
    public void method(){
        System.out.println("Class E");
        super.method();
    }
}
class B extends A{
    public void method(){
        System.out.println("Class B");
        super.method();
    }
}
// Multilevel Inheritance
class C extends B{
    public void method(){
        System.out.println("Class C");
        super.method();
    }
}
// Multiple Inheritance
interface AA{
    public static void method(){
        System.out.println("Interface AA");
    }
}
interface BB{
    public static void method(){
        System.out.println("Interface BB");
    }
}
class D implements AA, BB{
    public static void method(){
        System.out.println("Class D");
        AA.method();
        BB.method();
    }
}
//class A{
//    public static void method(){
//        System.out.println("Class A");
//    }
//}
