package com.monitiseMea;

import com.monitiseMea.models.Location;
import com.monitiseMea.models.Order;
import com.monitiseMea.models.Product;
import com.monitiseMea.models.ProductHolder;
import com.monitiseMea.models.Warehouse;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashCode2016 {

    static List<Product> products = new ArrayList<Product>();
    static List<Warehouse> warehouses = new ArrayList<Warehouse>();
    static List<Order> orders = new ArrayList<Order>();

    static int row, columns, numDrones, maxLoad, deadline, prodTypeCount, numWarehouses, numOrders;

    public static void main(String[] args) throws Exception{

        System.out.println("Hello World");

        readFile();
        validateInputs();

    }

    static void validateInputs() {
        System.out.printf("%d %d %d %d %d\n", row, columns, numDrones, deadline, maxLoad);
        System.out.printf("%d\n", products.size());

        for (int i = 0; i < products.size(); i++)
            System.out.print(products.get(i).getWeight() + " ");
        System.out.println();

        System.out.printf("%d\n", warehouses.size());

        for (int i = 0; i < warehouses.size(); i++) {
            Warehouse warehouse = warehouses.get(i);
            System.out.printf("%s\n", warehouse.getLocation());

            for (int j = 0; j < warehouse.getProductHolders().size(); j++) {
                System.out.print(warehouse.getProductHolders().get(j).getCount() + " ");
            }

            System.out.println();
        }

        System.out.printf("%d\n", orders.size());

        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            System.out.printf("%s\n", order.getDeliveryLocation());
            System.out.printf("%d\n", order.getProductCount());

            for(ProductHolder holder : order.getHolders()) {
                for (int j = 0; j < holder.getCount(); j++) {
                    System.out.print(holder.getProductType() + " ");
                }
            }


            System.out.println();
        }

        System.out.println();
    }

    static void readFile() throws Exception {

        File file = new File("input.txt");
        Scanner input = new Scanner(file);

        row = input.nextInt();
        columns = input.nextInt();
        numDrones = input.nextInt();
        deadline = input.nextInt();
        maxLoad = input.nextInt();

        prodTypeCount = input.nextInt();

        for(int i = 0; i < prodTypeCount; i++) {
            products.add(new Product(i, input.nextInt()));
        }

        numWarehouses = input.nextInt();

        for(int i = 0; i < numWarehouses; i++) {
            Warehouse warehouse = new Warehouse(new Location(input.nextInt(), input.nextInt()));

            for(int j = 0; j < prodTypeCount; j++) {
                warehouse.addProduct(products.get(j), input.nextInt());
            }

            warehouses.add(warehouse);
        }

        numOrders = input.nextInt();

        for (int i = 0; i < numOrders; i++) {
            Order order = new Order(new Location(input.nextInt(), input.nextInt()));
            int productCount = input.nextInt();
            for (int j = 0; j < productCount; j++) {
                order.addOrder(input.nextInt());
            }
            orders.add(order);
        }
    }
}
