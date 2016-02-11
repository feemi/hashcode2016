package com.monitiseMea.models;

public class Drone {

    private Location currentLocation, heading;
    private Product currentProduct;

    public Drone(Location currentLocation, Product currentProduct, Location heading) {
        this.currentLocation = currentLocation;
        this.currentProduct = currentProduct;
        this.heading = heading;
    }

    public void setHeading(Location heading) {
        this.heading = heading;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setCurrentProduct(Product currentProduct) {
        this.currentProduct = currentProduct;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public Product getCurrentProduct() {
        return currentProduct;
    }

    public Location getHeading() {
        return heading;
    }
}
