package com.example.lenovo.command;

/**
 * Created by lenovo on 2019/4/3.
 */

public class SellStockOrder implements Order {
    Stock stock;

    public SellStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
