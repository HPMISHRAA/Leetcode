class Solution {
    public int secondHighest(String s) {
        int fmax = -1;
        int smax = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';

                if (digit > fmax) {
                    smax = fmax;
                    fmax = digit;
                } else if (digit < fmax && digit > smax) {
                    smax = digit;
                }
            }
        }
        return smax;
    }
}