package com.example.lenovo.simple_factory;

import com.example.lenovo.factory_method.Fruit;

/**
 * Created by lenovo on 2019/3/27.
 */

public class SimpleFactory {

    public static Fruit getFruit(String fruitName) {
        Fruit fruit = null;

        try {
            Class clazz = Class.forName(fruitName);
            fruit = (Fruit) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return fruit;
    }
}
