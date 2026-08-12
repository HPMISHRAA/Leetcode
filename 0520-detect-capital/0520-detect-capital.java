class Solution {
    public boolean detectCapitalUse(String word) {
        if (isUpper(word) || isLower(word) || thirdCondition(word)) {
            return true;
        }
        return false;
    }

    public static boolean isUpper(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return str.length() == count;
    }

    public static boolean isLower(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        return str.length() == count;
    }

    public static boolean thirdCondition(String str) {
        char ch = str.charAt(0);
        String sub = str.substring(1);
        if (Character.isUpperCase(ch) && isLower(sub)) {
            return true;
        }
        return false;
    }
}