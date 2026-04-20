import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ENGLISH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null){
            return null;
        }
        String[] parts = stringDate.split("\\s+");
        int h = 0, m = 0, s = 0;
        boolean evening = stringDate.contains("evening");
        boolean morning = stringDate.contains("morning");

        for (int i = 1; i < parts.length; i++) {
            if (parts[i].equals("hours")) {
                h = Integer.parseInt(parts[i - 1]);
            } else if (parts[i].equals("minutes")) {
                m = Integer.parseInt(parts[i - 1]);
            } else if (parts[i].equals("seconds")) {
                s = Integer.parseInt(parts[i - 1]);
            }
        }

        if (evening && h < 12) {
            h += 12;
        } else if (morning && h == 12) {
            h = 0;
        }

        return LocalTime.of(h, m, s);
    }
}
