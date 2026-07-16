class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,h=findMax(nums),ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int val=findCeil(mid,nums);
            if(val<=threshold){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static int findMax(int[] arr){
        int max=-1;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static int findCeil(int val,int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/val);
        }
        return sum;
    }
}