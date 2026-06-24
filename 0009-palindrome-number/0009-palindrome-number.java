class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;

        int no=0;
        int original=x;
        while(x!=0){
            int rem=x%10;
            no=(no*10)+rem;
            x/=10;
        }
        return original==no;
    }
}