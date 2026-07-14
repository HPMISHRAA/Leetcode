class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:nums){
           hm.put(val,hm.getOrDefault(val,0)+1);
           if(hm.get(val)>2){
            return false;
           }
        }
        return true;
    }
}