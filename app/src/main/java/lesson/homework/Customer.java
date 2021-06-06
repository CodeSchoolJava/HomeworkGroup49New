package lesson.homework;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements OnSelllListener{
    @Override
    public String toString() {
        return "Customer{" +
                "balace=" + balace +
                ", bucket=" + bucket +
                '}';
    }

    public double balace;
    private List<Products> bucket;
    public Customer(String name, String surName, int age, GenderType gender,double balace) {
        super(name, surName, age, gender);
        this.balace=balace;
    }

    @Override
    public void working() {
        System.out.println("i am programmer");

    }

    public void setBalace(double balace) {
        this.balace = balace;
    }

    public double getBalace() {
        return balace;
    }
    public void addProduct(Products product){
        if (product!= null){
            if (bucket ==null){
             bucket=new ArrayList<>() ;
            }
            bucket.add(product);

        }
    }
    public void buy(OnBuyListener listener){
      if(listener !=null){
          if (bucket !=null){
           double endPrice=0;
              for (Products product:bucket) {
               endPrice +=product.getPrice();
              }
              listener.buy(endPrice);
              balace -=endPrice;
          }
      }
    }

    @Override
    public void onSelled(String message) {

    }
}

