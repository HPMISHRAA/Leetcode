class Solution {
    public void rotate(int[][] matrix) {
        // int n=matrix.length;
        // int[][] rotated=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         rotated[j][n-i-1]=matrix[i][j];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.arraycopy(rotated[i],0,matrix[i],0,n);
        // }


        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=matrix[i][right];
                matrix[i][right]=matrix[i][left];
                matrix[i][left]=temp;
                left++;
                right--;
            }
        }
    }
}