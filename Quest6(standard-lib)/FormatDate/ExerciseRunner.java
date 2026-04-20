import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExerciseRunner {

    public static void main(String[] args) {
        System.out.println(FormatDate.formatToFullText(LocalDateTime.of(2021, 8, 22, 13, 25, 46)));
        System.out.println(FormatDate.formatSimple(LocalDate.of(2022, 2, 13)));
        System.out.println(FormatDate.formatIso(LocalTime.of(16, 18, 56, 8495847)));
    }
}

// $ javac *.java -d build
// $ java -cp build ExerciseRunner 
// Le 22 août de l'an 2021 à 13h25m et 46s
// febbraio 13 22
// 16:18:56.008495847
// $ 
