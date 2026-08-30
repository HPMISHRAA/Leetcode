class Solution {
    public int singleNumber(int[] nums) {
        TreeSet<Integer> ans = new TreeSet<>();
        for (int no : nums) {
            if (ans.contains(no)) {
                ans.remove(no);
            } else {
                ans.add(no);
            }

        }
        return ans.first();
    }
}