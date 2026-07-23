class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i);
        }
        int sum1=0;
        for(int i=0;i<t.length();i++){
            sum1+=t.charAt(i);
        }
        return (char) (sum1-sum);
    }
}