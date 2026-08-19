class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
            if (entries.getValue() == 1) {
                sum += entries.getKey();
            }
        }
        return sum;
    }
}