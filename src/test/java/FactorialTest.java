import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.com.konrad.factorial.Factorial;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class FactorialTest {

    @Test
    public void testFactorialIterativeBaseFive() {
        BigInteger base = BigInteger.valueOf(5);

        BigInteger expectedResult = BigInteger.valueOf(120);
        BigInteger actualResult = Factorial.countIterative(base);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorialIterativeBaseTen() {
        BigInteger base = BigInteger.valueOf(10);

        BigInteger expectedResult = BigInteger.valueOf(3628800);
        BigInteger actualResult = Factorial.countIterative(base);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorialIterativeBaseFifteen() {
        BigInteger base = BigInteger.valueOf(15);

        BigInteger expectedResult = BigInteger.valueOf(1307674368000L);
        BigInteger actualResult = Factorial.countIterative(base);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorialIterativeBaseTwenty() {
        BigInteger base = BigInteger.valueOf(20);

        BigInteger expectedResult = BigInteger.valueOf(2432902008176640000L);
        BigInteger actualResult = Factorial.countIterative(base);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorialRecursiveBaseFive() {
        BigInteger base = BigInteger.valueOf(5);

        BigInteger expectedResult = BigInteger.valueOf(120);
        BigInteger actualResult = Factorial.countRecursive(base);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorialRecursiveBaseTen() {
        BigInteger base = BigInteger.valueOf(10);

        BigInteger expectedResult = BigInteger.valueOf(3628800);
        BigInteger actualResult = Factorial.countRecursive(base);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorialRecursiveBaseFifteen() {
        BigInteger base = BigInteger.valueOf(15);

        BigInteger expectedResult = BigInteger.valueOf(1307674368000L);
        BigInteger actualResult = Factorial.countRecursive(base);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFactorialRecursiveBaseTwenty() {
        BigInteger base = BigInteger.valueOf(20);

        BigInteger expectedResult = BigInteger.valueOf(2432902008176640000L);
        BigInteger actualResult = Factorial.countRecursive(base);
        assertEquals(expectedResult, actualResult);
    }

//    public FactorialTest(BigInteger base, BigInteger result) {
//        this.base = base;
//        this.result = result;
//    }
//
//    @Parameterized.Parameters
//    public static List<BigInteger> base() {
//        List<BigInteger> listOfBases = new ArrayList<>();
//        listOfBases.add(BigInteger.valueOf(0));
//        listOfBases.add(BigInteger.valueOf(1));
//        listOfBases.add(BigInteger.valueOf(2));
//        listOfBases.add(BigInteger.valueOf(3));
//        listOfBases.add(BigInteger.valueOf(4));
//        listOfBases.add(BigInteger.valueOf(5));
//        listOfBases.add(BigInteger.valueOf(6));
//        listOfBases.add(BigInteger.valueOf(7));
//        listOfBases.add(BigInteger.valueOf(8));
//        listOfBases.add(BigInteger.valueOf(9));
//        listOfBases.add(BigInteger.valueOf(10));
//        listOfBases.add(BigInteger.valueOf(11));
//        listOfBases.add(BigInteger.valueOf(12));
//        listOfBases.add(BigInteger.valueOf(13));
//        listOfBases.add(BigInteger.valueOf(14));
//        listOfBases.add(BigInteger.valueOf(15));
//        listOfBases.add(BigInteger.valueOf(16));
//        listOfBases.add(BigInteger.valueOf(17));
//        listOfBases.add(BigInteger.valueOf(18));
//        listOfBases.add(BigInteger.valueOf(19));
//        listOfBases.add(BigInteger.valueOf(20));
//        return listOfBases;
//    }
//    @Parameterized.Parameters
//    public static List<BigInteger> result() {
//        List<BigInteger> listOfResults = new ArrayList<>();
//        listOfResults.add(BigInteger.valueOf(1));
//        listOfResults.add(BigInteger.valueOf(1));
//        listOfResults.add(BigInteger.valueOf(2));
//        listOfResults.add(BigInteger.valueOf(6));
//        listOfResults.add(BigInteger.valueOf(24));
//        listOfResults.add(BigInteger.valueOf(120));
//        listOfResults.add(BigInteger.valueOf(720));
//        listOfResults.add(BigInteger.valueOf(5040));
//        listOfResults.add(BigInteger.valueOf(40320));
//        listOfResults.add(BigInteger.valueOf(362880));
//        listOfResults.add(BigInteger.valueOf(3628800));
//        listOfResults.add(BigInteger.valueOf(39916800));
//        listOfResults.add(BigInteger.valueOf(479001600));
//        listOfResults.add(BigInteger.valueOf(6227020800L));
//        listOfResults.add(BigInteger.valueOf(87178291200L));
//        listOfResults.add(BigInteger.valueOf(1307674368000L));
//        listOfResults.add(BigInteger.valueOf(20922789888000L));
//        listOfResults.add(BigInteger.valueOf(355687428096000L));
//        listOfResults.add(BigInteger.valueOf(6402373705728000L));
//        listOfResults.add(BigInteger.valueOf(121645100408832000L));
//        listOfResults.add(BigInteger.valueOf(2432902008176640000L));
//        return listOfResults;
//    }
//    private final BigInteger base;
//    private final BigInteger result;
//
//
//    @Test
//    public void testFactorialIterative() {
//        BigInteger actualResult = Factorial.countIterative(base);
//        assertEquals(result,actualResult);
//    }
}
