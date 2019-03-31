package com.example.lenovo.factory_method;

/**
 * Created by lenovo on 2019/3/27.
 */

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
