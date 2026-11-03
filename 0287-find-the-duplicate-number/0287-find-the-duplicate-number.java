class Solution {
    public int findDuplicate(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;

        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int val : nums) {
        //     if (arr.contains(val)) {
        //         return val;
        //     } else {
        //         arr.add(val);
        //     }
        // }
        // return -1;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums){
            if(map.containsKey(val)){
                return val;
            }else{
                map.put(val,0);
            }
        }
        return -1;
    }
}