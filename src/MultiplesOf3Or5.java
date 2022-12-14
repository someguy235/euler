/*
    If we list all the natural numbers below 10 that are multiples of 3 or 5,
    we get 3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class MultiplesOf3Or5 {
    public static void main(String[] args){
        MultiplesOf3Or5 m = new MultiplesOf3Or5();
        System.out.println(m.find(1000));
    }

    private int find(int max){
        int sum = 0;

        for(int i=0; i<max; i++){
            if(i % 3 == 0) sum += i;
            if(i % 15 == 0) continue;
            if(i % 5 == 0) sum += i;
        }

        return sum;
    }
}
