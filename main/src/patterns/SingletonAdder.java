package patterns;

public class SingletonAdder {

    private int quantity = 0;

    private SingletonAdder() {

    }

    private static final SingletonAdder instance = new SingletonAdder();

    public static SingletonAdder getInstance() {
        return instance;
    }

    public synchronized void addQuantity(int amount) {
        quantity += amount;
    }

    public synchronized boolean removeQuantity(int amount) {
        if (quantity < amount) return false;
        quantity -= amount;
        return true;
    }

    public synchronized int getQuantity() {
        return quantity;
    }
}
