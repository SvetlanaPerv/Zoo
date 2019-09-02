package main.java;

import java.util.HashMap;

public abstract class Food {
    private int value=0;
    //private static HashMap<Food, Integer> map = HashMap<>();

    public Food(int value) {
        this.value = value;
    }

    public void addFood(int value){
       this.value+=value;
    }

    public void minusFood(int value){
        this.value-=value;
    }

    public int getValue() {
        return value;
    }

    public abstract String nameFood();
}
