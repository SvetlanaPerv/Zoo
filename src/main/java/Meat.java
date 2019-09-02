package main.java;

public class Meat extends PreyFood{
    public Meat(int value) {
        super(value);
    }
    @Override
    public String nameFood() {
        return "Мясо";
    }
}
