public class LongestCommonPrefix {
}

class Solution4 {
    public String longestCommonPrefix(String[] strs) {
        String strss = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                while (i > 0) {
                    if (strs[i].charAt(j) == strs[i+1].charAt(j)) {
                        strss = String.valueOf(strs[i].charAt(j));
                    }
                }
                return strss;
            }
        }