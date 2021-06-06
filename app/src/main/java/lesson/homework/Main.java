package lesson.homework;

import lesson.homework.arevtur.Customer;
import lesson.homework.arevtur.GenderType;
import lesson.homework.arevtur.Products;
import lesson.homework.arevtur.Seller;
import lesson.homework.arevtur.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop=new Shop(new Seller("Ani","Smith",30,GenderType.FEMALE),100000);
                Customer customer=new Customer("Adam","Kirakosyn",25, GenderType.MALE,50000);
                customer.addProduct(new Products(2000));
                shop.setListener(customer);
                customer.buy(shop);
        System.out.println(customer);
        System.out.println(shop);
    }
}
