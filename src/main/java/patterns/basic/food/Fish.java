package model.food;

public class Fish extends Food {

    public Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Quantity of fish eaten: " + getQuantity());
    }
}
