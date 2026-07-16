class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,hi=findMax(piles),ans=-1;
        while(l<=hi){
            int mid=l+(hi-l)/2;
            long hour=totalHour(mid,piles);
            if(hour<=h){
                ans=mid;
                hi=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static long totalHour(int hr,int[]arr){
        long h=0;
        for(int i=0;i<arr.length;i++){
            h+=(long)Math.ceil((double)arr[i]/hr);
        }
        return h;
    }
    public static int findMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}