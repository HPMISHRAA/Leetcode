class Solution {
    public int secondHighest(String s) {
        int flargest = -1;
        int slargest = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                if (digit > flargest) {
                    slargest = flargest;
                    flargest = digit;
                } else if (digit < flargest && digit > slargest) {
                    slargest = digit;
                }
            }
        }
        return slargest;
    }
}