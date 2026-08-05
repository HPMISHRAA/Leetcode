class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        sum(0,candidates,target,ans,res);
        return res;
    }
    public static void sum(int index,int arr[],int k,List<Integer> ans, List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(index==arr.length || k<0){
            return ;
        }
        ans.add(arr[index]);
        sum(index,arr,k-arr[index],ans,res);
        ans.remove(ans.size()-1);
        sum(index+1,arr,k,ans,res);
    }
}