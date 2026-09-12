class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit=ch-'0';
                if(!arr.contains(digit)){
                    arr.add(digit);
                }
            }
        }
        Collections.sort(arr);
        if (arr.size() < 2) {
            return -1;
        }
        return arr.get(arr.size() - 2);
    }
}