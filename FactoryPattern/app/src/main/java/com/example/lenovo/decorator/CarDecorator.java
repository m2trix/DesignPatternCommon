package com.example.lenovo.decorator;

/**
 * Created by lenovo on 2019/4/1.
 */

public abstract class CarDecorator implements Car{

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarDecorator(Car car) {
        this.car = car;
    }

    public abstract void show();
}
