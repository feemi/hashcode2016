package com.monitiseMea.models;

public class Product {

    private int type, weight;

    public Product(int type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public int getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
