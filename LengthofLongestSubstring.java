public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) {
          return 0;
        }
        String check = "";
        String cList[] = s.split("");
        int max = 0;

        for(int i =0; i < cList.length; i++) {
          int index = check.indexOf(cList[i]);
          if ( index == -1) {
            check += cList[i];

            if (max < check.length()) {
              max = check.length();
            }
          } else {
            check = check.substring(index + 1);
            check += cList[i];
            if (max < check.length()) {
              max = check.length();
            }
          }
        }
        return max;
    }

}
