class Solution {
    public int[] runningSum(int[] nums) {
        int[] RunningSum=new int[nums.length];
        int sum=0;
        for(int i=0;i<=nums.length-1;i++){
            sum+=nums[i];
            RunningSum[i]=sum;
        }
        return RunningSum;
    }
}