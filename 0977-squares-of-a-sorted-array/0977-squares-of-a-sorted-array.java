class Solution {
    public int[] sortedSquares(int[] nums) {
        //     for(int i=0;i<nums.length;i++){
        //         nums[i]=nums[i]*nums[i];
        //     }
        //     Arrays.sort(nums);
        //     return nums;

        int l = 0, h = nums.length - 1;
        int k = nums.length - 1;
        int[] arr = new int[nums.length];
        while (l <= h) {
            int left = nums[l] * nums[l];
            int right = nums[h] * nums[h];
            if (left > right) {
                arr[k] = left;
                l++;
            } else {
                arr[k] = right;
                h--;
            }
            k--;
           
        }
         return arr;

    }
}