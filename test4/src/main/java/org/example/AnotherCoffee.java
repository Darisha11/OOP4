package org.example;

public class AnotherCoffee implements Printable {
    private final int id;
    private int cost;
    public int water;
    public int zerna;
    public int zakaz;

    public AnotherCoffee(int id, int cost, int water, int zerna, int zakaz) {
        this.id = id;
        this.cost = cost;
        this.water = water;
        this.zerna = zerna;
        this.zakaz = zakaz;
    }

    @Override
    public String getInfo() {
        return "Кофе " + id + ": стоимость - " + cost + ", вода - " + water + ", зёрна - " + zerna + ", заказы - " + zakaz;
    }

    public int getCost() {
        return cost;
    }
    public int getWater() {
        return water;
    }
    public int getZerna() {
        return zerna;
    }
    public int getZakaz() {
        return zakaz;
    }
    public int getId() {
        return id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
