package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factor = 1;
        System.out.println(factor);
        //Runs loop and multiplies factor each time runned
        for (int i=1; i<=printToInclusive; i++) {
            factor = factor*i;
            System.out.println(factor);
        }

    }
}
