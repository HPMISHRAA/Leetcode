class Solution {
    public int[] twoSum(int[] nums, int target) {
        // ------Brute Force------------
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target)
        //         return new int[]{i,j};
        //     }
        // }
        // return new int []{-1,-1};

        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int number=target-nums[i];
            if(hm.containsKey(number)){
                return new int[]{hm.get(number),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}