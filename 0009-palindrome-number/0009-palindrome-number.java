class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int no=x;
        int val=0;
        while(x!=0){
            int rem=x%10;
            val=(val*10)+rem;
            x/=10;
        }
        return val==no;
    }
}