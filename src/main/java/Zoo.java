package main.java;
/*

 */

import java.util.ArrayList;

public class Zoo {

    static int Cages;
    static ArrayList<Food> listFood = new ArrayList<>();
    static ArrayList<Aviary> listAviary = new ArrayList();

    static {
        listFood.add(new Banana(10));
        listFood.add(new Grass(5));

        listFood.add(new Meat(7));
        listFood.add(new Ant());
        System.out.println("Привезли еду!");

        listAviary.add(new AviaryHerbAnimal("Север", 2));
        listAviary.add(new AviaryHerbAnimal("Юг", 3));
        listAviary.add(new AviaryPreyAnimal("Запад", 1));
        listAviary.add(new AviaryPreyAnimal("Восток", 2));
        System.out.println("Установили вольеры!");
    }

    public static void feedAnimal(Animal animal){
        for (int i=0; i<listFood.size() && animal.isHungry(); i++) {
            if (animal.isAnimalFeedFood(listFood.get(i))) {
                while (listFood.get(i).getValue() > 0 && animal.isHungry()) {
                    animal.eat(listFood.get(i));
                }
            }
        }
        if (!animal.isHungry()){
            System.out.println(animal.nameAnimal()+" "+animal.getName()+ " сытый(сытая)");
        }else {
            System.out.println(animal.nameAnimal()+" "+animal.getName() + " голодный(ная) "+ animal.getHungry());
        }
    }

    public static void aviaryAnimal(Animal animal){
        if (animal.aviary!=null){
            System.out.println(animal.getName()+" уже в вольере "+animal.aviary.getNameAviary());
            return;
        }

        for(int i=0; i<listAviary.size() && animal.aviary==null; i++){
            if (listAviary.get(i).isGoodAviary(animal)){
                if (listAviary.get(i).addAnimal(animal));
            }
        }
    }

    public static void printOstFood(){
       System.out.println("\nОстатки еды: ");
       for (Food food: listFood){
           System.out.println(food.nameFood()+" = "+ food.getValue());
       }
    }

    public static void printAvaiary(){
        System.out.println("\nВольеры: ");
        for(Aviary aviary: listAviary){
            System.out.println(aviary.getNameAviary()+". Количество мест "+aviary.getSizeAviary());
            for (Animal animal : aviary.listAnimal)
                System.out.println(animal.getName());
        }

    }

    public static void main(String[] args) {
        Monkey bob = new Monkey("Bob", -1, 1);
        Ptichka charlie = new Ptichka("charlie", -15);
        Lion lion = new Lion("Leo", -5);
        Tiger tigerMax = new Tiger("TigerMax", -3);
        Tiger tigerTim = new Tiger("TigerTim", 0);
        Tiger tigerBu = new Tiger("TigerBu", 0);

        aviaryAnimal(bob);
        aviaryAnimal(charlie);
        aviaryAnimal(lion);
        aviaryAnimal(tigerMax);
        aviaryAnimal(tigerTim);
        aviaryAnimal(tigerBu);
        printAvaiary();

        feedAnimal(bob);
        feedAnimal(charlie);
        feedAnimal(lion);
        feedAnimal(tigerMax);
        printOstFood();
    }

}











