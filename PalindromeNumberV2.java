public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } 
        
        int len = 0;
        int tem = x;
        while (tem != 0) {
            tem = tem/10;
            len++;
        }
        int median = len /2;
        
        for (int i = 1; x > 0; i=i+2) {
            double dtail = x % 10;
            double dhead = x/(Math.pow(10, (len-i)));
            int tail = (int) dtail;
            int head = (int) dhead;
            
            if (head != tail) {
                return false;
            } else { //remove tail and head
                x = (int)((x % (Math.pow(10, (len-i)))) / 10);
            }
        }
        
        return true;
        
    }
}
