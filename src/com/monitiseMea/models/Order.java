package com.monitiseMea.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<ProductHolder> holders = new ArrayList<ProductHolder>();
    Location deliveryLocation;
    int productCount;

    int clusterNumber;

    public Order(Location deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public void addOrder(int productType) {
        productCount++;
        for(ProductHolder holder : holders) {
            if(holder.getProductType() == productType) {
                holder.incrementCountAndGet();
                return;
            }
        }

        holders.add(new ProductHolder(new Product(productType, 0), 1));
    }

    public int getProductCount() {
        return productCount;
    }

    public List<ProductHolder> getHolders() {
        return holders;
    }

    public Location getDeliveryLocation() {
        return deliveryLocation;
    }
}
