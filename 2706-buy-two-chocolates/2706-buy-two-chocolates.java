class Solution {
    public int buyChoco(int[] prices, int money) {
        // Brute Force---------
        // Arrays.sort(prices);
        // int buy=prices[0]+prices[1];
        // if(buy>money){
        //     return money;
        // }else{
        //     return money-buy;
        // }

        int fm=Integer.MAX_VALUE;
        int sm=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<fm){
                sm=fm;
                fm=prices[i];
            }else if(prices[i]>=fm && prices[i]<=sm){
                sm=prices[i];
            }
        }
        int buy=fm+sm;
        if(buy>money){
            return money;
        }else{
            return money-buy;
        }
    }
}