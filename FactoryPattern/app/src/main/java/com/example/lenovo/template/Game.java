package com.example.lenovo.template;

/**
 * Created by lenovo on 2019/4/8.
 */

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
