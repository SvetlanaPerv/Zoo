package main.java;

public class AviaryPreyAnimal extends Aviary{
    public AviaryPreyAnimal(int sizeAviary, String nameAviary) {
        super(sizeAviary, nameAviary);
    }

    public AviaryPreyAnimal(String nameAviary, int sizeAviary) {
        super(sizeAviary, nameAviary);
    }

    @Override
    public String getNameAviary() {
        return "Вольер для хищников "+super.getNameAviary();
    }
}
