class Solution {
    private final String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        helper(0,ans,digits,"");
        return ans;
    }
    public void helper(int index,List<String> ans,String digits,String current){
        if(index==digits.length()){
            ans.add(current);
            return ;
        }
        String s=map[digits.charAt(index)-'0'];
        for(int i=0;i<s.length();i++){
            helper(index+1,ans,digits,current+s.charAt(i));
        }
    }
}