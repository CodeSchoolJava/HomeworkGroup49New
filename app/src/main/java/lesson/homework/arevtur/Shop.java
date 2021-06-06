package lesson.homework.arevtur;

public class Shop implements OnBuyListener {
    private Seller seller;
    private double balance;
    private OnSellListener listener;
    public Shop(Seller seller,double balance){
        this.seller=seller;
        this.balance=balance;
    }

    public void setListener(OnSellListener listener) {
        this.listener = listener;
    }

    public OnSellListener getListener() {
        return listener;
    }

    public Seller getSeller() {
        return seller;
    }

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "seller=" + seller +
                ", balance=" + balance +
                ", listener=" + listener +
                '}';
    }

    @Override
    public void buy(double price) {
        balance+=price;
productSell(listener);
    }
    public void productSell(OnSellListener listener){
        if(listener!=null){
            listener.onSelledListener("thanks");
        }
    }

}
