package com.example.lenovo.command;

/**
 * Created by lenovo on 2019/4/3.
 */

public class BuyStockOrder implements Order {
    private Stock stock;

    public BuyStockOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
