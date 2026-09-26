class Solution {
    public int[] rearrangeArray(int[] nums) {
        /*
        int n=nums.length;
        int [] arr=new int[n];
        int pos=0,neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[neg]=nums[i];
                neg+=2;
            }
        else{
            arr[pos]=nums[i];
            pos+=2;
        }
        }
        return arr;
        */
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);

            }
        }
        for (int i = 0; i < n / 2; i++) {
            nums[i * 2] = pos.get(i);
            nums[i * 2 + 1] = neg.get(i);
        }
        return nums;
    }
}