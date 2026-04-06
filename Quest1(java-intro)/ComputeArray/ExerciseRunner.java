public class ExerciseRunner {
    public static void main(String[] args) {
        int[] array = ComputeArray.computeArray(new int[]{9, 13, 8, 23, 1, 0, 89, -67});
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

// $ javac *.java -d build
// $ java -cp build ExerciseRunner
// 45 20 8 23 8 0 89 -74
// $
