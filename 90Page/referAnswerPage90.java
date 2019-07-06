
//사용자가 지정한 최대 값까지 소수를 생성, 사용된 알고리즘은 에라스토네스의 체라는 알고리즘.
//책에 쓰인 답을 내식대로 조금 변경함. 그래도 처음 답보다는 깔끔한걸 알수있음.

import java.util.*;

public class GeneratePrimes {
    private static boolean[] isPrime;
    private static int[] result;

    public static int[] GeneratePrimes(int maxValue) {
        if (maxValue < 2)
            return new int[0];
        else {
            initializeIsPrime(maxValue);
            JeAlgorithm();
            initializeResult();
            getResultRightValue();
            return result;
        }
    }

    private static void initializeIsPrime(int maxValue) {
        isPrime = new boolean[maxValue + 1];
        Arrays.fill(isPrime, 2, isPrime.length, true);// 0,1은 거짓
    }

    private static void JeAlgorithm() {
        for (int i = 2; i <= endPointAlgorithm(); i++)
            if (isPrime[i])
                isPrimeMultiplies();
    }

    private static int endPointAlgorithm() {
        return Math.sqrt(isPrime.length);
    }

    private static void isPrimeMultiplies() {
        for (int j = 2 * i; j < s; j += i)
            isPrime[j] = false;
    }

    private static void initializeResult() {
        result = new int[countPrime()];
    }

    private static int countPrime() {
        int count = 0;
        for (int i = 0; i < isPrime.length; i++)
            if (isPrime[i])
                count++;
        return count;
    }

    private static void getResultRightValue() {
        for (int i = 0, j = 0; i < isPrime.length; i++)
            if (isPrime[i])
                result[j++] = i;
    }

}
