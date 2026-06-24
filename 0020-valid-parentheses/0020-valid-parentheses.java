class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                sc.push(c);
            } else {
                if(sc.isEmpty())
                return false;
                char ch = sc.pop();
                if (ch == '(' && c != ')' || ch == '{' && c != '}' || ch == '[' && c != ']')
                    return false;
            }
        }
        return sc.isEmpty();
    }
}