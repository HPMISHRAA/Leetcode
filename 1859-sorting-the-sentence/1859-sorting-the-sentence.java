class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        HashMap<Integer,String> map=new HashMap<>();
        for(String val:words){
            int size=val.length();
            int position=val.charAt(size-1)-'0';
            map.put(position,val.substring(0,size-1));
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=words.length;i++){
            sb.append(map.get(i));
            if(i<words.length){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}