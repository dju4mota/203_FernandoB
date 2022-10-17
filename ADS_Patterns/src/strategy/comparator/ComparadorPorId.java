package strategy.comparator;

import java.util.Comparator;

public class ComparadorPorId implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1 , Animal animal2) {
        return animal1.getId().compareTo(animal2.getId());
    }
}
