class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> first = new HashSet<>();
        for (int val : nums1) {
            first.add(val);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int val : nums2) {
            if (first.contains(val)) {
                result.add(val);
            }
        }
        int[] arr = new int[result.size()];
        int i = 0;
        for (int val : result) {
            arr[i++] = val;
        }
        return arr;
    }
}