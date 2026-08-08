class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> res = new ArrayList<>();
        findPartition(0, s, ans, res);
        return ans;
    }

    public static void findPartition(int index, String str, List<List<String>> ans, List<String> res) {
        if (index == str.length()) {
            ans.add(new ArrayList<>(res));
            return;
        }
        for (int i = index; i < str.length(); i++) {
            if (isPalindrome(str, index, i)) {
                res.add(str.substring(index, i + 1));
                findPartition(i + 1, str, ans, res);
                res.remove(res.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String str, int l, int h) {
        while (l <= h) {
            if (str.charAt(l++) != str.charAt(h--)) {
                return false;
            }
        }
        return true;
    }
}