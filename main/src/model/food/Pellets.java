package model.food;

public class Pellets extends Food {

    public Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Quantity of pellets eaten: " + getQuantity());
    }
}
