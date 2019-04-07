package com.example.lenovo.template;

/**
 * Created by lenovo on 2019/4/8.
 */

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
