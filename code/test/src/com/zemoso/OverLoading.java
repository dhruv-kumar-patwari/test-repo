package com.zemoso;

public class OverLoading {
    public static int add(int a, int b){
        System.out.println("Int");
        return a+b;
    }
    public static float add(float a, float b){
        System.out.println("Float");
        return a+b;
    }
    public static double add(double a, double b){
        System.out.println("Double");
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1f, 2));
        System.out.println(add(1d, 2d));
    }
}
