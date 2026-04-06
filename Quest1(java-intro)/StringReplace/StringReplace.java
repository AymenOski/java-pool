public class StringReplace {
    public static String replace(String s, String target, String replacement) {
        return s.replace(target, replacement);
    }

    public static String replace(String s, char target, char replacement) {
        return s.replace(target, replacement);
    }

    public static String replace(String s, String target, char replacement) {
        return s.replace(target, String.valueOf(replacement));
    }

    public static String replace(String s, char target, String replacement) {
        return s.replace(String.valueOf(target), replacement);
    }
}
