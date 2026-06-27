class Solution {
    public int majorityElement(int[] nums) {
        int count=0,elem=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                count++;
                elem=nums[i];
            }else if(nums[i]==elem){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==elem){
                count1++;
            }
        }
        if(count1>(n/2)){
            return elem;
        }
        return -1;
    }
}