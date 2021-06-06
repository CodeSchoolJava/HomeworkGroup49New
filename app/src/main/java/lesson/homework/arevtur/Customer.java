package lesson.homework.arevtur;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements OnSellListener {

    private double balance;
    private List<Products> bucket;

    public Customer(String name, String surname, int age, GenderType gender, double balance) {
        super(name, surname, age, gender);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                ", bucket=" + bucket +
                '}';
    }

    @Override
    public void work() {
        System.out.println("I am programmer");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addProduct(Products product) {
        if (product != null) {
            if (bucket == null) {
                bucket = new ArrayList<>();
            }
            bucket.add(product);
        }
    }

    public void buy(OnBuyListener listener) {
        if (listener != null) {
            if (bucket != null) {
                double endPrice = 0;
                for (Products product : bucket) {
                    endPrice += product.getPrice();
                }
                listener.buy(endPrice);
                balance -= endPrice;
            }
        }

    }

    @Override
    public void onSelled(String message) {
        System.out.println("by");
    }
}
