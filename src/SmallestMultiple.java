/*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {
    public static void main(String[] args){
        SmallestMultiple s = new SmallestMultiple();
        System.out.println(s.smallest(20));
    }

    private int smallest(int target){
        List<Integer> validFactors = getValidFactors(target);
        System.out.println(validFactors);
        for(int i=validFactors.get(validFactors.size()-1); ;i++){
            boolean valid = true;
            for(int j : validFactors){
                if(i % j != 0){
                    valid = false;
                    break;
                }
            }
            if(valid) return i;
        }
    }
    private List<Integer> getValidFactors(int target){

        List<Integer> validFactors = new ArrayList<>();
        for(int i=2; i<=target; i++){
            validFactors.add(i);
        }

        for(int i=target; i>=2; i--){
            if(validFactors.contains(i)){
                List<Integer> invalidFactors = getFactors(i);
                if(invalidFactors.size() > 2) {
                    for (int j : invalidFactors) {
                        validFactors.remove((Integer) j);
                    }
                }
            }
        }

        return validFactors;
    }

    private List<Integer> getFactors(int f){
        List<Integer> factors = new ArrayList<>();

        for(int i=2; f>1; ){
            if(f % i == 0) {
                factors.add(i);
                f /= i;
                factors.add(f);
                i=2;
            }else{
                i++;
            }
        }

        return factors;
    }
}
