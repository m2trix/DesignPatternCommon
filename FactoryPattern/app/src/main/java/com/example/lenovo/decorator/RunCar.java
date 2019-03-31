package com.example.lenovo.decorator;

/**
 * Created by lenovo on 2019/4/1.
 */

public class RunCar implements Car {
    @Override
    public void show() {
        this.run();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }
}
