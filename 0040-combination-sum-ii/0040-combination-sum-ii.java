class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(0,target,candidates,ans,res);
        return res;
    }
    public static void combinationSum(int index,int sum,int arr[],List<Integer> ans,List<List<Integer>> res){
        if(sum==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(sum<0 || index==arr.length){
            return;
        }
        ans.add(arr[index]);
        combinationSum(index+1,sum-arr[index],arr,ans,res);
        ans.remove(ans.size()-1);

        for(int i=index+1;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                combinationSum(i,sum,arr,ans,res);
                break;
            }
        }
    }
}