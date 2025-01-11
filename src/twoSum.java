public class twoSum {
    public static void main(String[] args) {
        System.out.println("------What?---------");
        int[] num = {1, 2, 3};
        int numm = 4;
        int[] result = Solution.twoSum(num, numm);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

    }
    
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        // If no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }
}