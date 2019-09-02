package main.java;
public abstract class Animal {
    private int hungry;
    private final String name;
    public Aviary aviary;

    public Animal(String name) {
        this.name = name;
        hungry = -60;
    }

    public Animal(int hungry, String name) {
        this.hungry = hungry;
        this.name = name;
    }

    public Animal( String name, int hungry) {
        this.hungry = hungry;
        this.name = name;
    }

    public void eat(Food food) {
        boolean isGood=false;
        if (isAnimalFeedFood(food)){
            food.minusFood(1);
            this.hungry ++;
            System.out.println(this.nameAnimal()+" "+this.getName()+" съел(a) "+food.nameFood());
        }else
            System.out.println(this.nameAnimal()+" "+this.getName()+" не ест "+food.nameFood());
    }

    public void eat(Animal animal, Food food, int value) {
        boolean isGood=false;
        if (isAnimalFeedFood(food)){
            food.minusFood(value);
            this.hungry+=value;
            System.out.println(animal.nameAnimal()+" "+animal.getName()+" съел(a) "+food.nameFood());
        }else
            System.out.println(animal.nameAnimal()+" "+animal.getName()+" не ест "+food.nameFood());
    }


//    public boolean eat(Banana  banana){
//        hungry += banana.value;
//        banana.value = 0;
//        return hungry >= 0;
//        return false;
//    }

   // public abstract boolean eat(Ant ant);

    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println(this.name + hungry);
        } else {
            System.out.println("ЖРАААААТЬ! " + hungry);
        }
    }

    public boolean isHungry(){
        if (this.hungry<0) return true;
        else return false;
    }

    public abstract String nameAnimal();

    // ест ли животное эту еду
    public boolean isAnimalFeedFood(Food food) {
        if (((this instanceof HerbAnimal) && (food instanceof HerbFood))
                || ((this instanceof PreyAnimal) && (food instanceof PreyFood)))
            return true;
        else return false;
    }

    public int getHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }

}
