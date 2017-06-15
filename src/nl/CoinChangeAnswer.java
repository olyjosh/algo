package nl;

import java.util.ArrayList;

/**
 *
 * @author Olyjosh
 */
public class CoinChangeAnswer {

    public int OPT[][];
    // contains the optimal solution during every recurrence step.
    public String optimalChange[][]; // string representation of optimal solutions.
    /**
     * List of all possible solutions for the target
     */
    public ArrayList<String> allPossibleChanges = new ArrayList<String>();
    /**
     * The target amount.
     */
    private int target;
    /**
     * Copy of the denominations that was used to generate this solution
     */
    public int[] denoms;

    private CoinChangeAnswer(int target, int[] denoms) {
        this.target = target;
        this.denoms = denoms;
    }

    /**
     * Find all possible solutions recursively
     *
     * @param tsoln - The current solution string
     * @param startIx - The start index in the denomination array.
     * @param remainingTarget - The remaining target amount to be satisfied.
     * @param answer - The final answer object.
     */
    private static void findAllCombinationsRecursive(String tsoln, int startIx, int remainingTarget, CoinChangeAnswer answer) {
        for (int i = startIx; i < answer.denoms.length; i++) {
            int temp = remainingTarget - answer.denoms[i];
            String tempSoln = tsoln + "" + answer.denoms[i] + ",";
            if (temp < 0) {
                break;
            }
            if (temp == 0) {
                // reached the answer hence quit from the loop
                //if(tempSoln.length()==6){  // Olyjosh, I did this to affect the total number of coin pieces to 3 (i.e 6/2)
                    answer.allPossibleChanges.add(tempSoln);
                //}
                break;
            } else {
        // target not reached, try the solution recursively with the
                // current denomination as the start point.
                findAllCombinationsRecursive(tempSoln, i, temp, answer);
            }
        }
    }

    public static CoinChangeAnswer findAllPossibleCombinations(int target, int[] denoms) {
        CoinChangeAnswer soln = new CoinChangeAnswer(target, denoms);
        String tempSoln = new String();
        findAllCombinationsRecursive(tempSoln, 0, target, soln);
        return soln;
    }

    /**
     * Find the optimal solution for a given target value and the set of
     * denominations
     *
     * @param target
     * @param denoms
     * @return
     */
    public static CoinChangeAnswer findOptimalChange(int target, int[] denoms) {
        CoinChangeAnswer soln = new CoinChangeAnswer(target, denoms);
        StringBuilder sb = new StringBuilder();

        // initialize the solution structure
        for (int i = 0; i < soln.OPT[0].length; i++) {
            soln.OPT[0][i] = i;
            soln.optimalChange[0][i] = sb.toString();
            sb.append(denoms[0] + " ");
        }

     // Read through the following for more details on the explanation
        // of the algorithm.
        // http://condor.depaul.edu/~rjohnson/algorithm/coins.pdf
        for (int i = 1; i < denoms.length; i++) {
            for (int j = 0; j < target + 1; j++) {
                int value = j;
                int targetWithPrevDenomiation = soln.OPT[i - 1][j];
                int ix = (value) - denoms[i];
                if (ix >= 0 && (denoms[i] <= value)) {
                    int x2 = denoms[i] + soln.OPT[i][ix];
                    if (x2 <= target && (1 + soln.OPT[i][ix] < targetWithPrevDenomiation)) {
                        String temp = soln.optimalChange[i][ix] + denoms[i] + " ";
                        soln.optimalChange[i][j] = temp;
                        soln.OPT[i][j] = 1 + soln.OPT[i][ix];
                    } else {
                        soln.optimalChange[i][j] = soln.optimalChange[i - 1][j] + " ";
                        soln.OPT[i][j] = targetWithPrevDenomiation;
                    }
                } else {
                    soln.optimalChange[i][j] = soln.optimalChange[i - 1][j];
                    soln.OPT[i][j] = targetWithPrevDenomiation;
                }
            }
        }
        return soln;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};//coin denominations, hoping that supply is unlimited
        int s=12;
//        int[] arr = new int[s/2];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
        ArrayList<String> list = findAllPossibleCombinations(s, arr).allPossibleChanges;
        for (String e : list) {
            System.out.print(e + "  ");
        }
//        System.out.println(findOptimalChange(17, arr).optimalChange);
    }

}
