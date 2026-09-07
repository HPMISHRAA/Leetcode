class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int isEven(int no) {
        int count = 0;
        while (no != 0) {
            count++;
            no /= 10;
        }
        return count;
    }
}