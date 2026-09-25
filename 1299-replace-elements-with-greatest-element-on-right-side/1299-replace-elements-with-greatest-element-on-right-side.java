class Solution {
    public int[] replaceElements(int[] arr) {
        /*
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                arr[i]=-1;
            }
            int max=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            arr[i]=max;
        }
        return arr;
        */
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int var = arr[i];
            arr[i] = max;
            max = Math.max(var, max);
        }
        return arr;
    }
}