class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,res,ans);
        return ans;
    }
    public static void subset(int index,int arr[],List<Integer> res,List<List<Integer>> ans){
        if(index==arr.length){
            ans.add(new ArrayList<>(res));
            return ;
        }
        res.add(arr[index]);
        subset(index+1,arr,res,ans);
        res.remove(res.size()-1);

        for(int i=index+1;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                subset(i,arr,res,ans);
                return;
            }
        }
        subset(arr.length,arr,res,ans);
    }
}