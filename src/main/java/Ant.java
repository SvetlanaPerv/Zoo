package main.java;
public class Ant extends PreyFood{
    //public int valueAnt = 1;

    public Ant() {
        super(5);
    }

    public Ant(int value) {
        super(value);
    }

    @Override
    public String nameFood() {
        return "Муравей";
    }
}

