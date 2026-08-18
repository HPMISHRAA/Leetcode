class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                res.append(reverse(arr[i]) + " ");
            } else {
                res.append(reverse(arr[i]));
            }
        }
        return new String(res);
    }

    public static String reverse(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }
        return new String(res);
    }
}