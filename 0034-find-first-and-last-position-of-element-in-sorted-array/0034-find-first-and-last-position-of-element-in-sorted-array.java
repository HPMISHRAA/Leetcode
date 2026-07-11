class Solution {
    public int[] searchRange(int[] nums, int target) {
        // --------- Using Lower Bound and Upper Bound--------
    //     int ans[]={-1,-1};
    //     int n=nums.length;
    //     if(nums==null || nums.length==0)
    //     return new int[]{-1,-1};

    //     int lb=findStartPosition(nums,target);
    //     int ub=findEndPosition(nums,target);
    //     if(lb==nums.length|| nums[lb]!=target){
    //         return new int[]{-1,-1};
    //     }else{
    //         return new int[]{lb,ub-1};
    //     }
        
    // }
    // public static int findStartPosition(int[] arr,int tar){
    //         int l=0,h=arr.length-1,ans=arr.length;
    //         while(l<=h){
    //             int mid=(l+h)/2;
    //             if(arr[mid]>=tar){
    //                 ans=mid;
    //                 h=mid-1;
    //             }else{
    //                 l=mid+1;
    //             }
    //         }
    //         return ans;
    // }
    // public static int findEndPosition(int[] arr,int tar){
    //     int l=0,h=arr.length-1,ans=arr.length;
    //     while(l<=h){
    //         int mid=l+(h-l)/2;
    //         if(arr[mid]>tar){
    //             ans=mid;
    //             h=mid-1;
    //         }else{
    //             l=mid+1;
    //         }
    //     }
    //     return ans;
    


    // -----------Using proper binar search------------


    if(nums==null || nums.length==0)
        return new int[]{-1,-1};

        int first=firstOccu(nums,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        int last=lastOccu(nums,target);
        return new int[]{first,last};
    }

    public static int firstOccu(int []arr,int target){
        int l=0,h=arr.length-1,ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                ans=mid;
                h=mid-1;
            }else if(arr[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }

    public static int lastOccu(int []arr,int target){
        int l=0,h=arr.length-1,ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]==target){
                ans=mid;
                l=mid+1;
            }else if(arr[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
}