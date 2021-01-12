package pl.natora.exercises.collections;
import java.util.*;

public class ListApplication {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 5, 7, 5, 8));
        ListHelper.removeDuplicates(list);
        System.out.println(list);
        assert list.equals(Arrays.asList(7,5,8));
    }
}