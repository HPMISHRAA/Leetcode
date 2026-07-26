class Solution {
    public int maxDifference(String s) {
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                continue;
            }
            else if(arr[i]%2==0){
                min=Math.min(min,arr[i]);
            }else{
                max=Math.max(max,arr[i]);
            }
        }
        return max-min;
    }
}