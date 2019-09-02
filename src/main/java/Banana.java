package main.java;
public class Banana extends HerbFood{
    public Banana(int value) {
        super(value);
    }

    @Override
    public String nameFood() {
        return "Банан";
    }
}
