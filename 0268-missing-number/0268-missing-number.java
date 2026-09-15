class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sum1 = 0;
        for (int val : nums) {
            sum1 += val;
        }
        return (sum - sum1);
    }
}