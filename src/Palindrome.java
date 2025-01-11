public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        Solution2 solution = new Solution2();
        boolean isSolution = solution.isPalindrome(x);
        System.out.print(isSolution);
    }

}

class Solution2 {
    public static boolean isPalindrome(int x) {
        int length = String.valueOf(Math.abs(x)).length();
        String xs = "";
        String xa = Integer.toString(x);
        for (int i = length - 1; i >= 0; i--) {
            xs = xs + xa.charAt(i);
        }
        return  xs.equals(xa) ? true : false;
    }
}