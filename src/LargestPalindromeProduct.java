/*
    A palindromic number reads the same both ways. The largest palindrome made
    from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class LargestPalindromeProduct {
    public static void main(String[] args){
        LargestPalindromeProduct l = new LargestPalindromeProduct();
        System.out.println(l.findLargestPalindrome());
    }

    private int findLargestPalindrome(){
        int largest = 0;
        for(int i=100; i<1000; i++){
            for(int j=100; j<1000; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > largest) largest = product;
            }
        }
        return largest;
    }

    private boolean isPalindrome(int product){
        String s = String.valueOf(product);
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;
        for(; start < end; start++, end--){
            if(chars[start] != chars[end]) return false;
        }
        return true;
    }


}
