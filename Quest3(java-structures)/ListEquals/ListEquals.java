import java.util.List;

public class ListEquals {
    public static boolean areListsEqual(List<String> list1, List<String> list2) {
        if (list1 == null && list2 == null) {
            return true;
        }
        if (list1 == null || list2 == null || list1.isEmpty() && !list2.isEmpty() || list2.isEmpty() && !list1.isEmpty()){
            return false;   
        }
        int j = 0;
        for (String elem1 : list1){
            for (int i = j ; i < list1.size() ; i++){
                if (elem1.equals(list2.get(i))){
                    break;
                }else {
                    return false;
                }
            }
            j++;
        }
        return true;
    }
}

// or:
// public class ListEquals {
//     public static boolean areListsEqual(List<String> list1, List<String> list2) {
//         return list1.equals(list2);
//     }
// }
