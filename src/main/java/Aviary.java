package main.java;

import java.util.ArrayList;

public abstract class Aviary {
    private int sizeAviary=0;
    private String nameAviary;
    ArrayList<Animal> listAnimal = new ArrayList<>();

    public Aviary(int sizeAviary, String nameAviary) {
        this.sizeAviary = sizeAviary;
        this.nameAviary = nameAviary;
    }

    public int getSizeAviary() {
        return sizeAviary;
    }

    public String getNameAviary() {
        return nameAviary;
    }

    public boolean isGoodAviary(Animal animal){
        if( (animal instanceof HerbAnimal && this instanceof AviaryHerbAnimal)
            ||(animal instanceof PreyAnimal && this instanceof AviaryPreyAnimal)){
            return true;
        }else return false;
    }

    public boolean addAnimal(Animal animal){
        if (animal.aviary!=null) return false;
        if (this.getSpaceSize()>0) {
            if (isGoodAviary(animal)) {
                listAnimal.add(animal);
                animal.aviary=this;
                System.out.println(animal.getName() + " в вольере \"" + this.nameAviary+"\"");
                return true;
            } else
                System.out.println("Этот вольер не подходит для " + animal.getName());
                return false;

        }else{
            System.out.println("В вольере \"" +this.getNameAviary()+"\" нет места для "+ animal.getName());
            return false;
        }
    }

    // свободные места в вольере
    public int getSpaceSize(){
        return this.getSizeAviary()-listAnimal.size();
    }

    public void DelAnimal(Animal animal){
        listAnimal.remove(animal);
    }

}
