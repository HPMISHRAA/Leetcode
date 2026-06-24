class Solution {
    public int findDuplicate(int[] nums) {
        // ------------------Brute Force-------------
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j])
        //             return nums[i];
        //     }
        // }
        // return -1;
        //   --------------Using HashMap-------------------
        // HashMap<Integer, Integer> h = new HashMap<>();
        // for (int i : nums) {
        //     if (h.containsKey(i)) {
        //         return i;
        //     } else {
        //         h.put(i, 0);
        //     }
        // }

        // ---------------------Using ArrayList-----------
        // ArrayList<Integer> ar=new ArrayList<>();
        // for(int i:nums){
        //     if(ar.contains(i))
        //     return i;

        //     else
        //     ar.add(i);
        // }
        // ---------------------Using HashSet-------
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (hs.contains(i)) {
                return i;
            } else {
                hs.add(i);
            }
        }
        return -1;
    }
}