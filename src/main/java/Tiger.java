package main.java;

public class Tiger extends PreyAnimal{
    public Tiger(String name, int hungry) {
        super(name, hungry);
    }
    @Override
    public String nameAnimal() {
        return "Тигр";
    }
}
