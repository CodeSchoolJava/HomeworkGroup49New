package lesson.homework.arevtur;

public class Products {

    private double price;

    @Override
    public String toString() {
        return "Products{" +
                "price=" + price +
                '}';
    }

    public Products(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
