package lesson.homework.arevtur;

import java.util.ArrayList;
import java.util.List;

public class Customer  extends Person implements OnSellListener{
    private double balance;
 private List<Products> bucket;

    public Customer(String name, String surName, int age, GenderType gender, double balance) {
        super(name, surName, age, gender);
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
    public void working() {
        System.out.println("im programmer");
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void addProduct(Products product){
        if(product!=null){
            if(bucket==null){
                bucket= new ArrayList<>();
            }
            bucket.add(product);

        }
    }
    public void buy(OnBuyListener listener){
        if(listener!=null){
            if(bucket!=null){
                double endPrice =0;
                for(Products products:bucket){
                    endPrice+=products.getPrice();
                }
                listener.buy(endPrice);
                balance-=endPrice;
            }
        }
    }

    @Override
    public void onSelledListener(String message) {
        System.out.println("bye");

    }
}
