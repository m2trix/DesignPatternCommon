package com.example.lenovo.decorator;

/**
 * Created by lenovo on 2019/4/1.
 */

public class SwimCarDecorator extends CarDecorator {
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        swim();
    }

    @Override
    public void run() {

    }

    public void swim() {
        System.out.println("可以游");

    }
}
