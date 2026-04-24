public class ExerciseRunner {

    public static void main(String[] args)  {
        Raclette r = new BaseRaclette();
        System.out.println(r);
        r = new WithPickles(r);
        System.out.println(r);
        r = new WithColdMeats(r);
        System.out.println(r);
    }
}
// 
// $ javac *.java -d build
// $ java -cp build ExerciseRunner 
// Patate, fromage à raclette pour 1000 calories
// Patate, fromage à raclette, cornichons pour 1050 calories
// Patate, fromage à raclette, cornichons, charcuterie pour 1400 calories
// $
// 