package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int result = 0;
        if (power < 0 ) {
            System.out.println("too much power");
        } else if (power == 0){
            System.out.println(1);
        } else {
            for (int i = 0; i < power; i=i+2){
                result = i * 2;
                System.out.println(result);
            }
        }
    }

}
