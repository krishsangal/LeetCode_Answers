import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("DSA");

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "LeetCode");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
