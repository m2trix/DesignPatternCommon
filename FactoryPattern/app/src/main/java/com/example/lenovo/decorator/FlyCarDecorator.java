package com.example.lenovo.decorator;

/**
 * Created by lenovo on 2019/4/1.
 */

public class FlyCarDecorator extends CarDecorator {
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        fly();
    }

    @Override
    public void run() {

    }

    public void fly() {
        System.out.println("可以飞");
    }
}