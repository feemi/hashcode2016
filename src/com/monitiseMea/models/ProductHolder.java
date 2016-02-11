package com.monitiseMea.models;

public class ProductHolder {
    Product product;
    int count;


    public ProductHolder(Product product, int count) {
        this.count = count;
        this.product = product;
    }

    public int getProductType() {
        return product.getType();
    }

    public int getCount() {
        return count;
    }

    public int getCountAndIncrement() {
        int temp = count;
        count -= 1;

        return temp;
    }

    public int incrementCountAndGet() {
        count += 1;
        return count;
    }
}
