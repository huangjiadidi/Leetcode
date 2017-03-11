public class Solution {
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
