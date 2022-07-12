package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int result = 0;

        if (multiplyByAndToInclusive != 0) {
            while (Math.abs(multiplyByAndToInclusive) + 1 > counter ) {
                result = multiplyByAndToInclusive * counter;
                System.out.println(result);
                counter++;
            }
        }

    }

    public static void main(String[] args) {
        printMultiplied(-5);
    }
}
