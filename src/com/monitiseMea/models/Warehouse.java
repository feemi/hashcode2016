package com.monitiseMea.models;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private Location location;
    private List<ProductHolder> productHolders = new ArrayList<ProductHolder>();

    public Warehouse(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void addProduct(Product product, int count) {
        productHolders.add(new ProductHolder(product, count));
    }

    public List<ProductHolder> getProductHolders() {
        return productHolders;
    }
}
