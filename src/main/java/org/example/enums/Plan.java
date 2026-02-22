package org.example.enums;

public enum Plan {

    BASIC("Basic", 50),
    PREMIUM("Premium", 100),
    VIP("VIP", 150);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}