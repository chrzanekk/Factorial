package pl.com.konrad.factorial;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
            System.out.println(Factorial.countRecursive(BigInteger.valueOf(i)));
        }

        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
            System.out.println(Factorial.countIterative(BigInteger.valueOf(i)));
        }
    }
}
