package com.example.lenovo.adapter;

/**
 * Created by lenovo on 2019/4/8.
 */

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
