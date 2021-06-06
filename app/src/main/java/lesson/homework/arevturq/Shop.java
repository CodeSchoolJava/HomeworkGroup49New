package lesson.homework.arevturq;

public class Shop implements OnBuyListener {
    private Seller seller;
    private double balance;
    private OnSellListener listener;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public OnSellListener getListener() {
        return listener;
    }

    public void setListener(OnSellListener listener) {
        this.listener = listener;
    }

    public Shop(Seller seller, double balance) {
        this.seller = seller;
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void buy(double price) {
        balance+= price;
        prductsSell(listener);

    }
    public void prductsSell(OnSellListener listener){
        if(listener!= null){
            listener.onSelled("Thank you");
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "seller=" + seller +
                ", balance=" + balance +
                ", listener=" + listener +
                '}';
    }
}

