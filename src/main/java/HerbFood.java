package main.java;

public abstract class HerbFood extends Food{

    public HerbFood(int value) {
        super(value);
    }

    @Override
    public void addFood(int value) {
        super.addFood(value);
    }

    @Override
    public void minusFood(int value) {
        super.minusFood(value);
    }
}
