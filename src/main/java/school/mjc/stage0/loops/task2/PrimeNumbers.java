package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while(i<=printToInclusive){
            int p = 2, count = 0;
            while (p <= Math.pow(i, 1.0/2)){
                if(i % p == 0){
                    count ++;
                    break;
                }
                p++;
            }
            if (count == 0){
                System.out.println(i);
            }
            i++;
        }
        }


    public static void main(String[] args) {
        PrimeNumbers p = new PrimeNumbers();
        p.printPrimeNumbers(33);
    }
}

