class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int n = nums.length;
        // int min = n / 3 + 1;
        // List<Integer> list = new ArrayList<>();
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        //     if (map.get(nums[i]) == min) {
        //         list.add(nums[i]);
        //     }
        // }
        // return list;


        int cnt=0,cnt1=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int n=nums.length;
        int min=n/3+1;
        for(int num:nums){
            if(cnt==0 && num!=ele2){
                cnt++;
                ele1=num;
            }else if(cnt1==0 && num!=ele1){
                cnt1++;
                ele2=num;
            }else if(num==ele1){
                cnt++;
            }else if(num==ele2){
                cnt1++;
            }else{
                cnt--;
                cnt1--;
            }
        }
        List<Integer> list=new ArrayList<>();
        cnt=0;
        cnt1=0;
        for(int num:nums){
            if(num==ele1){
                cnt++;
            }else if(num==ele2){
                cnt1++;
            }
        }
        if(cnt>=min){
            list.add(ele1);
        }
        if(cnt1>=min){
            list.add(ele2);
        }
        
        return list;
    }
}