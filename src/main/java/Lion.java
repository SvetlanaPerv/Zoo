package main.java;

public class Lion extends PreyAnimal {
    public Lion(String name, int hungry) {
        super(name, hungry);
    }
    @Override
    public String nameAnimal() {
        return "Лев";
    }
}
