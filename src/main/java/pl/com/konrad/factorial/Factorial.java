package pl.com.konrad.factorial;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger countRecursive(BigInteger base) {
        if (isBaseEqualsOneOrZero(base)) {
            return BigInteger.ONE;
        } else {
            return base.multiply(countRecursive(base.subtract(BigInteger.ONE)));
        }
    }

    public static BigInteger countIterative(BigInteger base) {
        if (isBaseEqualsOneOrZero(base)) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = Integer.parseInt(String.valueOf(base)); i > 0; i--) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

    private static boolean isBaseEqualsOneOrZero(BigInteger base) {
        return base.equals(BigInteger.ONE) || base.equals(BigInteger.ZERO);
    }
}
