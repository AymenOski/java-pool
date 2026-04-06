public class CleanExtract {
    public static String extract(String s) {
       String[] parts = s.split("\\|");
       String result = "";
       int i = 0;
       for (String str : parts) {
        String condidate = "";
           int count = CleanExtract.countOccurrences(str);
           
            if (count == 0) {
                condidate = str.trim();
                if (condidate.trim().isEmpty()) {
                    continue;
                }

                if (i == 0) {
                    result += condidate;
                    i++;
                    continue;
                }
                result = result + " " + condidate;
            }else if (count >= 2){
                condidate = (str.substring(str.indexOf(".") + 1,str.lastIndexOf(".") )).trim();
                if (condidate.trim().isEmpty()) {
                    continue;
                }
                if (i == 0) {
                    result += condidate;
                    i++;
                    continue;
                }
                if (str.indexOf(".") == str.lastIndexOf(".") - 1) {
                    continue;
                }
                result = result + " " + condidate;

            }else {
                condidate = (str.substring(str.indexOf(".") + 1)).trim();
                if (condidate.trim().isEmpty()) {
                    continue;
                }
                if (i == 0) {
                    result += condidate;
                    i++;
                    continue;
                }
                result = result + " " + condidate;
            }
       }
       return result;
    }

    public static int countOccurrences(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                count++;
            }
        }

        return count;
    }
}
