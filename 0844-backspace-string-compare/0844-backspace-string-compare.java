class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first = new Stack<>();
        Stack<Character> second = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                first.push(ch);
            } else if (!first.isEmpty()) {
                first.pop();
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                second.push(ch);
            } else if (!second.isEmpty()) {
                second.pop();
            }
        }
        return first.equals(second);
    }
}