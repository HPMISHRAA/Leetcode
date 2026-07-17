class Solution {
    public int findPeakElement(int[] nums) {
        // Brute Force O(n);
        int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     if ((i == 0 || nums[i - 1] < nums[i]) && (i == n - 1 || nums[i + 1] < nums[i])) {
        //         return i;
        //     }
        // }
        // return -1;

        // OPtimal O(log n)
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        int l = 1, h = n - 2;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
}