package lesson.homework.arevtur;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements OnSellListener{
    private double balance;
    private List<Products> bucket;

    public Customer(String name, String surName, GenderType gender, int age, double balance) {
        super(name, surName, gender, age);
        this.balance = balance;
    }

    @Override
    public void working() {
        System.out.println("I am a programmer");
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public List<Products> getBucket() {
        return bucket;
    }

    public void addProduct(Products products) {
        if (products != null) {
            if (bucket == null) {
                bucket = new ArrayList<>();
            }
            bucket.add(products);
        }
    }

    public void buy(OnBuyListener onBuyListener) {

        if (onBuyListener != null) {
            if (bucket != null) {
                double endPrice = 0;
                for (Products product : bucket) {
                    endPrice += product.getPrice();
                }
                onBuyListener.buy(endPrice);
                balance = balance - endPrice;
            }

        }
    }

    @Override
    public void sell(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "balance=" + balance +
                ", bucket=" + bucket +
                '}';
    }
}