package main.java;
public class Monkey extends HerbAnimal{

    int Otlichie;

    public Monkey(String name, int hungry, int notUsed) {
        super(name, hungry);
        Otlichie = notUsed;
    }

//    public void test(Ant ant, int count){
//        ant.value = ant.value * count;
//        count = 10;
//    }

//    @Override
 //   public boolean eat(Ant ant) {
 //       return false;
 //   }

    @Override
    public void areYouHungry() {
        super.areYouHungry();
    }

    @Override
    public String nameAnimal() {
        return "Обезьяна";
    }
}
