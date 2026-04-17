import java.util.*;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> couples = new HashMap<>();

        Set<String> availableFirsts = new HashSet<>(first.keySet());

        Map<String, String> partnerOfFirst = new HashMap<>();
        Map<String, String> partnerOfsecond = new HashMap<>();

        while (!availableFirsts.isEmpty()) {
            for (String single : new HashSet<>(availableFirsts)) {
                for (String partner : first.get(single)) {
                    if (!partnerOfsecond.containsKey(partner)) {
                        partnerOfFirst.put(single, partner);
                        partnerOfsecond.put(partner, single);
                        availableFirsts.remove(single);
                        break;
                    } else {
                        String PartnerOfPartner = partnerOfsecond.get(partner);
                        int indexOfSingle = second.get(partner).indexOf(single);
                        int indexOfPartnerOfPartner = second.get(partner).indexOf(PartnerOfPartner);

                        if (indexOfSingle < indexOfPartnerOfPartner) {
                            partnerOfFirst.remove(PartnerOfPartner);
                            availableFirsts.add(PartnerOfPartner);

                            partnerOfFirst.put(single, partner);
                            partnerOfsecond.put(partner, single);
                            availableFirsts.remove(single);
                            break;
                        }
                    }
                }
            }
        }

        for (Map.Entry<String, String> entry : partnerOfFirst.entrySet()) {
            couples.put(entry.getKey(), entry.getValue());
        }

        return couples;
    }
}