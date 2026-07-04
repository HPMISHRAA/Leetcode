class Solution {
    public int maxProduct(int[] nums) {
        int fm=Integer.MIN_VALUE;
        int sm=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>fm){
                sm=fm;
                fm=nums[i];
            }
            else if(sm<nums[i] && nums[i]<=fm){
                sm=nums[i];
            }
        }
       int max=(fm-1)*(sm-1);
       return max;
    }
}