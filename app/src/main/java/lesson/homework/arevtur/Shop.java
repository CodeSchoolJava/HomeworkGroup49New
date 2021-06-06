package lesson.homework.arevtur;

public class Shop implements OnBuyListener {

    private Seller seller;
    private double balance;
    private OnSellListener listener;

    @Override
    public String toString() {
        return "Shop{" +
                "seller=" + seller +
                ", balance=" + balance +
                ", listener=" + listener +
                '}';
    }

    public Shop(Seller seller, double balance) {
        this.seller = seller;
        this.balance = balance;
    }

    public OnSellListener getListener() {
        return listener;
    }

    public void setListener(OnSellListener listener) {
        this.listener = listener;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Seller getSeller() {
        return seller;
    }

    @Override
    public void buy(double price) {
        balance += price;
        productsSell(listener);

    }

    public void productsSell(OnSellListener listener) {
        if (listener != null){
            listener.onSelled("Thank you");
        }


    }
}
