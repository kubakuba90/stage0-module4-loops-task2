package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number1 = 2;
        while (number1 <= printToInclusive) {
            int i = 2, count = 0;
            while (i <= number1 / 2) {
                if (number1 % i == 0) {
                    count++;
                    break;
                }
                i++;

            }
            if (count == 0) {
                System.out.println(number1);
            }
            number1++;
        }

    }
}
