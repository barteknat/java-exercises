package pl.natora.exercises.collections;
import java.util.*;

public class ListHelper {

    public static void removeDuplicates(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            List<Integer> unrepeteableList = new ArrayList<>(new LinkedHashSet<>(list));
            list.clear();
            list.addAll(unrepeteableList);
        }
    }
}