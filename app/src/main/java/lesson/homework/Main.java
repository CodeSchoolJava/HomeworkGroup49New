package lesson.homework;

import java.util.ArrayList;
import java.util.List;

import lesson.homework.arevtur.Customer;
import lesson.homework.arevtur.GenderType;
import lesson.homework.arevtur.Products;
import lesson.homework.arevtur.Seller;
import lesson.homework.arevtur.Shop;
import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

public class Main {
    public static void main(String[] args) {
//        Registration registration = new Registration();
//        registration.setName("Razmik");
//        registration.setSurname("Vardanyan");
//
//        UserInfo userInfo = UserInfo.getInstance();
//        System.out.println(userInfo.getName() + " " + userInfo.getSurName());
//        try {
//            System.out.println(userInfo.getBirthday().length());
//        } catch (NullPointerException n) {
//            System.out.println("Register your Birthday" + " ::::: " + n);
//
//        }

        Shop shop = new Shop(200000, new Seller("Hakob", "Hakobyan", GenderType.MALE, 20));
        Customer customer = new Customer("Raz", "Vardanyan", GenderType.MALE, 20, 1000);
        customer.addProduct(new Products(200));
        customer.addProduct(new Products(300));
        shop.setOnSellListener(customer);
        customer.buy(shop);
        System.out.println(customer + "\n" + shop);
    }
}