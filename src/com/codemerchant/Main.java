package com.codemerchant;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println();

        // instantiating new Duck object and dynamically changing it's flying behaviour
        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
