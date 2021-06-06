package lesson.homework;

import java.util.ArrayList;
import java.util.List;

import lesson.homework.arevturq.Customer;
import lesson.homework.arevturq.GenderType;
import lesson.homework.arevturq.Products;
import lesson.homework.arevturq.Seller;
import lesson.homework.arevturq.Shop;
import lesson.homework.userinfo.Registration;
import lesson.homework.userinfo.UserInfo;

public class Main {
    public static void main(String[] args) {
//        Registration user = new Registration();
//        user.setName("Walod");
//        user.setSurName("Hamazaszpyan");
//
//        UserInfo userInfo = UserInfo.getInstance();
//
//        try {
//            System.out.println(userInfo.getBirthDay().intern());
//            System.out.println(userInfo.getName());
//            System.out.println(userInfo.getSurName());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(userInfo.getName());


        Shop shop = new Shop(new Seller("Waruzhan", "Hakobyan", 23 , GenderType.MALE),100000);
        Customer customer = new Customer("Arshak","Baghdasaryan",45 , GenderType.MALE,50000) ;
        customer.addProduct(new Products(1000));
        customer.addProduct(new Products(890));
        customer.addProduct(new Products(5600));
        customer.addProduct(new Products(2000));

        shop.setListener(customer);
        customer.buy(shop);

        System.out.println(customer);
        System.out.println(shop);
    }
}
