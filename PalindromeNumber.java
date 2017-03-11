public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = reverse(x);
        if (rev - x == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public int reverse(int x) {
        long result = 0;
        Boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x = -x;
        }
        while (x != 0) {
            int num = x%10;
            result = result*10 + num;
            x = x/10;
            
        }
        
        if (isNeg == true) {
            result = -result;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)result;
    }
}
