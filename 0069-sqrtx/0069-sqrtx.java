class Solution {
    public int mySqrt(int x) {
        int l=0,h=x,ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            long val=(long) mid*(long) mid;
            if(val<=(long)x){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
}