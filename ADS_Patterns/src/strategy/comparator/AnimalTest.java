package strategy.comparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AnimalTest {

    @Test
    void deveListarAnimaisPeloNome(){
        List<Animal> listaDeAnimais = new ArrayList<Animal>();
        Animal a1 = new Animal(1L, "Tartaruga");
        Animal a2 = new Animal(2L, "Coelho");
        Animal a3 = new Animal(3L, "Cachorro");
        Animal a4 = new Animal(4L, "Gato");
        Animal a5 = new Animal(5L, "Girafa");
        Animal a6 = new Animal(6L, "Gato");

        listaDeAnimais.add(a1);
        listaDeAnimais.add(a2);
        listaDeAnimais.add(a3);
        listaDeAnimais.add(a4);
        listaDeAnimais.add(a5);
        listaDeAnimais.add(a6);

        listaDeAnimais.sort(new ComparadorPorNome());
        System.out.println("Ordenado por nome: ") ;
        listaDeAnimais.forEach(System.out::println);
    }

    @Test
    void deveOrdenarAnimaisPeloId(){
        List<Animal> listaDeAnimais = new ArrayList<Animal>();
        Animal a1 = new Animal(3L, "Tartaruga");
        Animal a2 = new Animal(5L, "Coelho");
        Animal a3 = new Animal(6L, "Cachorro");
        Animal a4 = new Animal(1L, "Gato");
        Animal a5 = new Animal(2L, "Girafa");
        Animal a6 = new Animal(4L, "Gato");

        listaDeAnimais.add(a1);
        listaDeAnimais.add(a2);
        listaDeAnimais.add(a3);
        listaDeAnimais.add(a4);
        listaDeAnimais.add(a5);
        listaDeAnimais.add(a6);

        listaDeAnimais.sort(new ComparadorPorId());
        System.out.println("Ordenado por id: ") ;
        listaDeAnimais.forEach(System.out::println);
    }
}
