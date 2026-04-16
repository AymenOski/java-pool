import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> sorted = new ArrayList<>(coins);
        Collections.sort(sorted, Collections.reverseOrder());

        List<Integer> change = new ArrayList<>();
        while (amount > 0){
            for (Integer coin : sorted){
                if (amount >= coin){
                    amount -= coin;
                    change.add(coin);
                    break;
                }
            }
        }
        return change;
    }
}
