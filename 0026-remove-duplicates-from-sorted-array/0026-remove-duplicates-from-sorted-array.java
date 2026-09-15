class Solution {
    public int removeDuplicates(int[] nums) {
        /*
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int val:nums){
            set.add(val);
        }
        int n=set.size();
        int i=0;
        for(int val:set){
            nums[i++]=val;
        }
        return n;
        */

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}