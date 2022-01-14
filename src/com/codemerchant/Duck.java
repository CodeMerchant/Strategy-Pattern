package com.codemerchant;

public abstract class Duck {
    FlyBehavior flyBehavior;         // All sub classes of Duck will inherit these two behavior interface types
    QuackBehavior quackBehavior;

    public Duck() {
    }

    abstract void display();

    void performFly(){
        flyBehavior.fly();   // Delegating to behavior class
    }

    void performQuack(){
        quackBehavior.quack();  // Delegating to behavior class

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
