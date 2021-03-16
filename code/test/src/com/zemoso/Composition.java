package com.zemoso;

class Car{
    Engine e = new Engine();
    public void run(){
        e.method();
        System.out.println("This is the car");
    }
}

class Engine{
    public void method(){
        System.out.println("This is the engine!");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}
