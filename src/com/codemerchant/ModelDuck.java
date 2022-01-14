package com.codemerchant;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // Duck starts off not being able to fly
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
