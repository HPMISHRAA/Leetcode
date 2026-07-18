class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length,n3=n1+n2;
        int i=0,j=0,k=0;
        int res[]=new int[n3];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }else{
                res[k++]=nums2[j++];
            }
        }
        while(i<n1){
            res[k++]=nums1[i++];
        }
        while(j<n2){
            res[k++]=nums2[j++];
        }
        if(n3%2!=0){
            return res[n3/2];
        }else{
            int pos=n3/2;
            int val=res[pos]+res[pos-1];
            return val/2.0;
        }
    }
}