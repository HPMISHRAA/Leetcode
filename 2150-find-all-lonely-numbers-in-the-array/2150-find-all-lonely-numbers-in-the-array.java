class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (hm.get(num) == 1 && !hm.containsKey(num + 1) && !hm.containsKey(num - 1)) {
                ans.add(num);
            }
        }
        return ans;
    }
}