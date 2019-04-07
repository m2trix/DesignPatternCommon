package com.example.lenovo.template;

/**
 * Created by lenovo on 2019/4/8.
 */

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
