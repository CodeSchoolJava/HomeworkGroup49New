package lesson.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop=new Shop(new Seller("Artyom","Matevosyan",29,GenderType.MALE),500000);
        Customer customer=new Customer("Arshak","Baxdasayan",25,GenderType.MALE,500000);
        List<Products> products= new ArrayList<>();
        customer.addProduct(new Products(1000));
        customer.addProduct(new Products(3000));
        customer.addProduct(new Products(2000));
        customer.addProduct(new Products(1000));
        shop.setListener(customer);
        customer.buy(shop);
        System.out.println(customer);
        System.out.println(shop);


        

    }
}
