package pawtropolis.animals.utils;

import pawtropolis.animals.model.abstractation.Animal;
import pawtropolis.animals.model.abstractation.Tailed;
import pawtropolis.animals.model.abstractation.Winged;

import java.util.Comparator;
import java.util.List;

public class SortUtils {

    public static List<Animal> sortByHeight(List<Animal> animals) {

        Comparator<Animal> sortByHeight = Comparator.comparing(Animal::getHeight);
        animals.sort(sortByHeight);

        return animals;

    }

    public static List<Animal> sortByWeight(List<Animal> animals) {

        Comparator<Animal> sortByWeight = Comparator.comparing(Animal::getWeight);
        animals.sort(sortByWeight);

        return animals;

    }

    public static List<Tailed> sortByTailLength(List<Tailed> animals) {

        Comparator<Tailed> sortByTailLength = Comparator.comparing(Tailed::getTailLength);
        animals.sort(sortByTailLength);

        return animals;

    }

    public static List<Winged> sortByWingSpan(List<Winged> animals) {

        Comparator<Winged> sortByWingSpan = Comparator.comparing(Winged::getWingSpan);
        animals.sort(sortByWingSpan);

        return animals;

    }

}
