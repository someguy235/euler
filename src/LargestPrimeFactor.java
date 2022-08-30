/*
    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
 */

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {
    public static void main(String[] args){
        LargestPrimeFactor l = new LargestPrimeFactor();
        System.out.println(l.findLargestPrimeFactor(600851475143L));
    }

    private long findLargestPrimeFactor(Long f){
        List<Integer> factors = findFactors(f);
        List<Integer> primes = sieve(factors);
        for(int i=factors.size() - 1; i> 0; i--){
            int factor = factors.get(i);
            if(primes.contains(factor)) return factor;
        }
        return 0;
    }

    private List<Integer> findFactors(Long f){
        List<Integer> factors = new ArrayList<>();

        for(int i=2; f>1; ){
            if(f % i == 0) {
                factors.add(i);
                f /= i;
                i=2;
            }else{
                i++;
            }
        }

        return factors;
    }

    private List<Integer> sieve(List<Integer> factors){
        int largest = factors.get(factors.size() - 1);
        boolean[] invalid = new boolean[largest + 1];
        List<Integer> primes = new ArrayList<>();

        for(int i=2; i<=largest/2; i++){
            for(int j=i+i; j<largest + 1; j += i){
                invalid[j] = true;
            }
        }

        for(int i=0; i<invalid.length; i++){
            if(!invalid[i]) primes.add(i);
        }

        return primes;
    }
}
