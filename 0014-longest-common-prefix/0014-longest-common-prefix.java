class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String fst = strs[0];
        String lst = strs[strs.length - 1];
        int index = 0;
        while (index < fst.length()) {
            if (fst.charAt(index) == lst.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return fst.substring(0, index);
    }
}