class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> ps = new HashMap<>();
        int count = 0, cPreSum = 0;
        ps.put(0, 1);
        for (int i = 0; i < n; i++) {
            cPreSum += nums[i];
            int sumToRemove = cPreSum - k;
            count += ps.getOrDefault(sumToRemove, 0);
            ps.put(cPreSum, ps.getOrDefault(cPreSum, 0) + 1);
        }
        return count;
    }
}