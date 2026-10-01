class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, l = 0, r = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                count++;
            }
        }
        return count;
    }
}