public class StringLength {
    public static int getStringLength(String s) {
        if (s != null) {
            if (!s.isEmpty()) {
                return s.length();
            }
        }

        return 0;
    }
}
