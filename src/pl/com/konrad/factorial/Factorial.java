package pl.com.konrad.factorial;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger countRecursive(int base) {
        if (BigInteger.valueOf(base).equals(BigInteger.ONE) || BigInteger.valueOf(base).equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(base).multiply(countRecursive(base-1));
        }
    }

    public static BigInteger countIterative(int base) {
        if (BigInteger.valueOf(base).equals(BigInteger.ONE) || BigInteger.valueOf(base).equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.valueOf(1);
            for (int i = base; i > 0 ; i--) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }
}
