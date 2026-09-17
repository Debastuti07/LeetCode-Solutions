class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }
    public int helper(int [] nums,int target,int lo,int hi){
        if(lo>hi) return -1;
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return helper(nums, target, lo, mid-1);
        else return helper(nums, target, mid+1, hi);
    }
}

// class Solution {
//     public int search(int[] arr, int target) {
//         int start=0;
//         int end=arr.length-1;
//         while(start>end)
//         {
//             return -1;
//         }
//         while(start<=end)
//         {
//             int mid=start+(end-start)/2;
//             if(target>arr[mid])
//             {
//                 start=mid+1;
//             }
//             else if(target<arr[mid])
//             {
//                end=mid-1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }