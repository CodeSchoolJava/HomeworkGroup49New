package lesson.homework;

import java.util.ArrayList;
import java.util.List;

import lesson.homework.arevturq.Customer;
import lesson.homework.arevturq.GenderType;
import lesson.homework.arevturq.Products;
import lesson.homework.arevturq.Seller;
import lesson.homework.arevturq.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop =new Shop(new Seller("Varuj","HAK",23, GenderType.MALE,5000);
        Customer customer = new Customer("Arsh","BAG",30, GenderType.MALE, 50000);
        customer.addProduct(new Products(1000));
        customer.addProduct(new Products(2000));
        customer.addProduct(new Products(3000));
        customer.addProduct(new Products(4000));

        shop.setListener(customer);
        customer.buy(shop);
        System.out.println(customer);
        System.out.println(shop);

    }
}
