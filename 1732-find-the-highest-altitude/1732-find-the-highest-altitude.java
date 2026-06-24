class Solution {
    public int largestAltitude(int[] gain) {
        // ----------------Brute Force--------------
        // int maximum=0;
        // int arr[]=new int[gain.length+1];
        // int j=1;
        // for(int i=0;i<gain.length;i++){
        //     arr[j]=arr[j-1]+gain[i];
        //     maximum=Math.max(maximum,arr[j]);
        //     j++;
        // }
        // return maximum;

        // --------------------Optimized------------------

        int current=0;
        int highest=current;
        for(int i:gain){
            current+=i;
            highest=Math.max(current,highest);
        }
        return highest;
    }
}