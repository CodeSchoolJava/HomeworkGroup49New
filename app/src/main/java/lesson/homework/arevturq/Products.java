package lesson.homework.arevturq;

public class Products {
    private double price;
    public Products(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "price=" + price +
                '}';
    }
}
