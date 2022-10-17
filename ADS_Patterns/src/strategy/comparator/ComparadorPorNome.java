package strategy.comparator;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1 , Animal animal2) {
        return animal1.getNome().compareTo(animal2.getNome());
    }
}
