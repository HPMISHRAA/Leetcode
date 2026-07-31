class Solution {
    public double myPow(double x, int n) {
        long num=n;
        if(n<0){
            return (1.0/power(x,-num));
        }
        return power(x,num);
    }
    public static double power(double x,long num){
        if(num==0){
            return 1.0;
        }
        if(num==1){
            return x;
        }
        if(num%2==1){
            return x*power(x,num-1);
        }
        return power(x*x,num/2);
    }
}