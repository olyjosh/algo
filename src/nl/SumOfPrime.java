
package nl;

/**
 *
 * @author olyjosh
 */
public class SumOfPrime {
    public static void main(String[] args) {
        int max = 2000000;

        //I implemented Sieve by taking true to be false n vice-versa, Just to avoid initial looping/flagging bla-bla
        boolean[] isPrime = new boolean[max];
        for (int i = 2; i*i < max; i++) {
            if (!isPrime[i]) {
                for (int j = i; i*j < max; j++) {
                    isPrime[i*j] = true;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i < max; i++) {
            if (!isPrime[i]) sum+=i;
        }
        System.out.println("Sum of prime <" + max + " is " + sum);
    }
}
