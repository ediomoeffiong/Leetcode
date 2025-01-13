public class DivideTwoIntegers {
    public static void main (String[] args) {
        int answer = Solution3.divide(10, 3);
        System.out.print(answer);
    }

}

class Solution3 {
    public static int divide(int dividend, int divisor) {
        boolean canDivide = true;
        int divided = 0;
        int count = 0;
        while (canDivide) {
            if (divided < dividend) {
                divided = divided + divisor;
                count ++;
                continue;
            } else if (divided == dividend) {
                canDivide = false;
            } else if (divided > dividend) {
                count --;
                continue;
            } else {
                canDivide = false;
            }

        }
        return count;
    }
}