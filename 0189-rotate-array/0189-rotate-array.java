class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rotateArray(0,nums.length-1-k,nums);
        rotateArray(nums.length-k,nums.length-1,nums);
        rotateArray(0,nums.length-1,nums);
    }
    static void rotateArray(int l,int h,int[]arr){
        while(l<=h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
}