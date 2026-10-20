class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        String vowels = "AEIOUaeiou";
        for (char ch : chars) {
            if (vowels.indexOf(ch) != -1) {
                stack.push(ch);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (vowels.indexOf(chars[i]) != -1) {
                chars[i] = stack.pop();
            }
        }
        return new String(chars);
    }
}