package lesson.homework;

import java.util.ArrayList;
import java.util.List;

import lesson.homework.arevtur.Customer;
import lesson.homework.arevtur.GenderType;
import lesson.homework.arevtur.Products;
import lesson.homework.arevtur.Seller;
import lesson.homework.arevtur.Shop;
import lesson.homework.userInfo.Registration;
import lesson.homework.userInfo.UserInfo;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop(new Seller("Aram","Davidyan",28, GenderType.MALE),100000);
        Customer customer = new Customer("Lilit","Kirakosyan",19,GenderType.FEMALE,80000);
        customer.addProduct(new Products(2000));
        shop.setListener(customer);
        customer.buy(shop);
        System.out.println(customer);
        System.out.println(shop);




//        Registration user = new Registration();
//        user.setName("Aram");
//        user.setSurname("Davidyan");
//
//
//        UserInfo userInfo = UserInfo.getInstance();
//        try {
//            System.out.println(userInfo.getBirthDay().intern());
//            System.out.println(userInfo.getName());
//            System.out.println(userInfo.getSurName());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//
    }
}
