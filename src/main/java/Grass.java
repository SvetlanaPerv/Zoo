package main.java;

public class Grass extends HerbFood{
    public Grass(int value) {
        super(value);
    }
    @Override
    public String nameFood() {
        return "Трава";
    }
}
