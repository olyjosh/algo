package nl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 *
 * @author Olyjosh
 */
public class SimpleFactorial {

    private static BigDecimal sum = new BigDecimal("0");
    private static final BigDecimal x=new BigDecimal(0.7893);
    private static final BigDecimal TWO=new BigDecimal(2);
    private static BigDecimal exp = x;
    private static BigInteger bi=BigInteger.ONE;

    
    private static BigDecimal factBig(int n){
        BigDecimal bd;
        BigDecimal div;
        for (int i = 2; i <= n; i++) {
            bi=bi.multiply(new BigInteger(""+i));
            //BigInteger factBig = factBig();
            bd = new BigDecimal(bi);
            div = bd.subtract(BigDecimal.ONE)
                    .divide(bd, 21, RoundingMode.HALF_UP);
            exp=exp.multiply(x);
            sum=sum.add(div.multiply(exp).multiply(TWO));
        }
        return sum.setScale(20, RoundingMode.HALF_UP);
    }
    
    
    public static void main(String[] args) {
        System.out.println(factBig(5000));
    }
}
