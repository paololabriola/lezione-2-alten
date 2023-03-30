package pawtropolis.animals.utils;

import pawtropolis.animals.model.abstractation.Animal;
import pawtropolis.animals.model.abstractation.Tailed;
import pawtropolis.animals.model.abstractation.Winged;

import java.util.List;

public class SearchUtils {

    public static Animal getShortest(List<Animal> animals){

        SortUtils.sortByHeight(animals);

        return animals.get(0);

    }

    public static Animal getTallest(List<Animal> animals){

        SortUtils.sortByHeight(animals);

        return animals.get(animals.size() - 1);

    }

    public static Animal getLightest(List<Animal> animals){

        SortUtils.sortByWeight(animals);

        return animals.get(0);

    }

    public static Animal getHeaviest(List<Animal> animals){

        SortUtils.sortByWeight(animals);

        return animals.get(animals.size() - 1);

    }

    public static Tailed getLongestTail(List<Tailed> animals){

        return SortUtils.sortByTailLength(animals).get(animals.size() - 1);

    }

    public static Winged getWidestWingSpan(List<Winged> animals){

        return SortUtils.sortByWingSpan(animals).get(animals.size() - 1);

    }

}
