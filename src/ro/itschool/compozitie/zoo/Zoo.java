package ro.itschool.compozitie.zoo;

public class Zoo {
    private Animal[] animals = new Animal[5];

    public void addAnimal(int position, Animal animal) {
        animals[position] = animal;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}
