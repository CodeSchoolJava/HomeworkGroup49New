package lesson.homework.arevtur;

public class Shop implements OnBuyListener {
    private double balance;
    private Seller seller;
    private OnSellListener onSellListener;

    public Shop(double balance, Seller seller) {
        this.balance = balance;
        this.seller = seller;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setOnSellListener(OnSellListener onSellListener) {
        this.onSellListener = onSellListener;
    }

    public OnSellListener getOnSellListener() {
        return onSellListener;
    }

    @Override
    public void buy(double price) {
        balance += price;
        if(onSellListener != null) {
            productSell(onSellListener);
        }
    }

    public void productSell(OnSellListener onSellListener) {
        if (onSellListener != null) {
            onSellListener.sell("Thanks you");
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "balance=" + balance +
                ", seller=" + seller +
                ", onSellListener=" + onSellListener +
                '}';
    }
}
