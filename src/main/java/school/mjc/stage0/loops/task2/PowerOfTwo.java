package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        while (power != 1 && power % 2 == 0 && power > 0) {
            power /= 2;
        }
        System.out.println(power == 1 ? power : "too much power");
      //  System.out.println("too much power");

    }
}
