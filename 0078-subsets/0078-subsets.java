class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        findSubset(0,nums.length,nums,ans,res);
        return res;
    }
    public static void findSubset(int ind,int length,int[] arr,List<Integer> ans,List<List<Integer>> res){
        if(ind==length){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[ind]);
        findSubset(ind+1,length,arr,ans,res);
        ans.remove(ans.size()-1);
        findSubset(ind+1,length,arr,ans,res);
    }
}