class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashMap<Integer, Integer>hm=new HashMap<>();
        // List<Integer> list=new ArrayList<>();
        // for(int val:nums){
        //     if(hm.containsKey(val)){
        //         list.add(val);
        //     }else{
        //         hm.put(val,hm.getOrDefault(val,0)+1);
        //     }
        // }
        // return list;

        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int val:nums){
            if(set.contains(val)){
                list.add(val);
            }else{
                set.add(val);
            }
        }
        return list;
    }
}