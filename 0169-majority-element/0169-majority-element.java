class Solution {
    public int majorityElement(int[] nums) {
        // int count=0,elem=0,n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(count==0){
        //         count++;
        //         elem=nums[i];
        //     }else if(nums[i]==elem){
        //         count++;
        //     }else{
        //         count--;
        //     }
        // }
        // int count1=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==elem){
        //         count1++;
        //     }
        // }
        // if(count1>(n/2)){
        //     return elem;
        // }
        // return -1;
        // ----------------------  Using HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : nums) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
            if (hm.get(val) > nums.length / 2) {
                return val;
            }
        }
        return -1;
    }
}