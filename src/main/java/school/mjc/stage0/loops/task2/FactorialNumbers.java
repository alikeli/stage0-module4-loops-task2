package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if (printToInclusive >= 0){
            int i = 1, p = 1;
            System.out.println(1);
            while (i<=printToInclusive){
                p *= i++;
                System.out.println(p);
            }
        }
    }
}
