class Solution {
    public boolean containsDuplicate(int[] nums) {
        // ------- Brute Force-------------
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // ---------Optimize----------
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)){
                return true;
            }else{
                hs.add(i);
            }
        }
        return false;
    }
}