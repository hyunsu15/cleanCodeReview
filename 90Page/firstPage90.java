
//사용자가 지정한 최대 값까지 소수를 생성, 사용된 알고리즘은 에라스토네스의 체라는 알고리즘.

import java.util.*;

public class GeneratePrimes {

    public static int[] GeneratePrimes(int maxValue) {
        if (GeneratePrimes.isValue(maxValue)) {
            // 선언
            int s = maxValue + 1;
            boolean[] f = new boolean[s];
            Arrays.fill(f, true);
            // 소수가 아닌 알려진 숫자를 제거
            f[0] = f[1] = false;

            althorigm(f);
            // 소수 개수
            int[] primes = new int[primeCount(s, f)];
            primes = answerPrime(s, f, primes);
            return primes;

        } else
            return new int[0];

    }

    public static boolean isValue(int value) {
        if (value >= 2)
            return true;
        else
            return false;
    }

    public static void althorigm(boolean[] f) {
        for (int i = 2; i < Math.sqrt(s) + 1; i++) {
            if (f[i]) {
                for (int j = 2 * i; j < s; j += i) {
                    f[j] = false;
                }
            }
        }
    }

    public static int primeCount(int s, boolean[] f) {
        int count = 0;
        for (int i = 0; i < s; i++) {
            if (f[i])
                count++;
        }
        return count;
    }

    public static answerPrime(int s,boolean[]f,int[] primes){
        for(int i=0,j=0;i<s;i++)
            {
                if(f[i])primes[j++]=i;
            }
            return primes;
    }

}
