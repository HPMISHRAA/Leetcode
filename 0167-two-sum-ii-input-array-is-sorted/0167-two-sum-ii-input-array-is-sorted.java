class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // -----------Brute Force-----------
        // int n=numbers.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};

        int l=0,h=numbers.length-1,n=numbers.length-1;
        while(l<h){
            int sum=numbers[l]+numbers[h];
            if(sum==target){
                return new int[]{l+1,h+1};
            }else if(sum<target){
                l++;
            }else{
                h--;
            }
        }
        return new int[]{-1,-1};
    }
}