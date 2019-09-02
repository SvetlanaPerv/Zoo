package main.java;
public class Ptichka extends HerbAnimal {

    int Wings;

    public Ptichka(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public void areYouHungry() {
        if (this.getHungry() >= 0) {
            System.out.println("Птичка сытая! " + this.getHungry());
        } else {
            System.out.println("ЖРАААААТЬ! " + this.getHungry());
        }

}

//    @Override
//    public boolean eat(Ant ant) {
//        return false;
//    }

    public void areYouHungry(int notUsed) {
        if (this.getHungry() >= 0) {
            System.out.println("Птичка сытая! " + this.getHungry());
        } else {
            System.out.println("ЖРАААААТЬ! " + this.getHungry());
        }

    }
    @Override
    public String nameAnimal() {
        return "Птичка";
    }


}
