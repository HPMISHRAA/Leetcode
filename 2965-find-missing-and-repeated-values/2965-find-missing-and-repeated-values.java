class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid[0].length;
        long sum=0,sum1=0;
        long sumN=(long)n*(n+1)/2,sumSN=(long)n*(n+1)*(2*n+1)/6;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                sum+=grid[i][j];
                sum1+=(long)grid[i][j]*grid[i][j];
            }
        }
        long val=sum-sumN;
        long val1=sum1-sumSN;
        val1=val1/val;
        long x=(val+val1)/2;
        long y=x-val;
        return new int[]{(int)x,(int)y};
    }
}