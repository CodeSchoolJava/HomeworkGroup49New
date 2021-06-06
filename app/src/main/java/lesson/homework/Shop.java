package lesson.homework;

public class Shop implements OnBuyListener{
    private Seller seller;
    private double balance;
    private OnSelllListener listener;

    @Override
    public String toString() {
        return "Shop{" +
                "seller=" + seller +
                ", balance=" + balance +
                ", listener=" + listener +
                '}';
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public OnSelllListener getListener() {
        return listener;
    }

    public void setListener(OnSelllListener listener) {
        this.listener = listener;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Shop(Seller seller, double balance) {
        this.seller = seller;
        this.balance = balance;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public void buy(double price) {
        balance += price;
        productSell(listener);

    }
    public void productSell(OnSelllListener listener){
        if (listener !=null){
            listener.onSelled("Thank you");
        }

    }
}
