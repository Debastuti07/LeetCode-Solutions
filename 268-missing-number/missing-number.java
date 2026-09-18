class Solution {
    public int missingNumber(int[] arr) {
        long TotalSum=0;
        long n=arr.length;
        long ActualSum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            TotalSum+=arr[i];
        }
        return (int)(ActualSum-TotalSum);
    }
}