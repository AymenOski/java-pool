import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<>(set1);
        res.addAll(set2);
        return res;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = set1.stream().filter(elem -> set2.contains(elem)).collect(Collectors.toSet());
        return res;
    }
}