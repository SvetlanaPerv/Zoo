package main.java;

public class AviaryHerbAnimal extends Aviary{
    public AviaryHerbAnimal(int sizeAviary, String nameAviary) {
        super(sizeAviary, nameAviary);
    }

    public AviaryHerbAnimal(String nameAviary, int sizeAviary) {
        super(sizeAviary, nameAviary);
    }

    @Override
    public String getNameAviary() {
        return "Вольер для травоядных "+super.getNameAviary();
    }
}
