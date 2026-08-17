class Solution {
    public double average(int[] salary) {
        int min = findMinimum(salary);
        int max = findMaximum(salary);
        int sum = findSum(salary) - (min + max);
        int n = salary.length - 2;
        double avg = (double) sum / n;
        return avg;
    }

    public static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}