package com.github.xenteros;

class CashDesk {

    private Manager manager;

    public void newOrder(String orderName) {
        manager.newOrder(orderName);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
